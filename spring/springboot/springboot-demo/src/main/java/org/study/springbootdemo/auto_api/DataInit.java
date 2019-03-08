package org.study.springbootdemo.auto_api;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.study.springbootdemo.auto_api.annotation.AutoApi;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DataInit implements ApplicationContextAware {

    private ApplicationContext context;
    private Map<String,MethodContent> bigMap = new HashMap<>();
    private ParameterNameDiscoverer discoverer = new DefaultParameterNameDiscoverer();

    @PostConstruct
    public void init(){
        //spring容器初始化结束 获取带有AutoApi的接口
        Map<String, Object> beans = context.getBeansWithAnnotation(AutoApi.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            //接口实例beanName
            String beanName = entry.getKey();
            //接口实例
            Class<?> serviceClass = entry.getValue().getClass();
            //自定义接口名称
            String interfaceName = serviceClass.getAnnotation(AutoApi.class).value();
            //接口方法
            Method[] methods = serviceClass.getDeclaredMethods();
            for (Method method : methods) {
                MethodContent<Object> methodContent = new MethodContent<>();
                bigMap.put(interfaceName,methodContent);
                handlerBeanType(method,methodContent);
            }
        }

    }
    private void handlerBeanType(Method method,MethodContent methodContent) {
        //方法名称
        methodContent.setMethodName(method.getName());
        /**
         * 返回值类型
         **/
        Class<?> returnTypeClass = method.getReturnType();
        if(returnTypeClass.getName().equals("void")){
            methodContent.setReturnType("void");
            methodContent.setReturnValue("void");
        }else{
            methodContent.setReturnType(returnTypeClass.getSimpleName());
            String[] beanType = judgeBeanType(returnTypeClass);
            if(beanType[1].equals("1")){//返回值为自定义bean类型
                methodContent.setReturnValue(null);
                loop(returnTypeClass.getSimpleName(),returnTypeClass);
            }
        }
        /**
         * 参数类型
         */
        String[] paramNames = discoverer.getParameterNames(method);
        Class<?>[] paramTypes = method.getParameterTypes();
        List<BeanContent> beanContentList = new ArrayList<>();
        for (int i = 0; i < paramTypes.length; i++) {
            BeanContent<Object> beanContent = new BeanContent<>();
            beanContent.setFieldName(paramNames[i]);
            beanContent.setFiledType(paramTypes[i].getSimpleName());
            beanContentList.add(beanContent);

            loop(paramNames[i],paramTypes[i]);
        }
        methodContent.setParamList(beanContentList);
    }

    public void loop(String paramName,Class<?> paramClass){
        String[]  beanType = judgeBeanType(paramClass);
        if(beanType[0].equals("0")){//基本数据类型
            System.out.println(beanType[1]+":"+paramName);
        }else if(beanType[0].equals("1")){//自定义bean
            Field[] fields = paramClass.getDeclaredFields();
            for (Field field : fields) {//所有字段
                String fieldName = field.getName();//字段名称
                Class<?> fieldTypeClass = field.getType();//字段类型
                loop(fieldName,fieldTypeClass);//递归判断
            }
        }
    }
    private String[] judgeBeanType(Class<?> type) {
        String[] result = new String[2];
        result[0]="0";//0 基本类型  1：bean
        String simpleName = type.getSimpleName();
        result[1]=simpleName;
        switch (simpleName){
            case "String":break;
            case "Integer":break;
            case "int":break;
            case "boolean":break;
            case "byte":break;
            case "short":break;
            case "long":break;
            case "float":break;
            case "double":break;
            case "char":break;
            case "BigDecimal":break;
            case "Byte":break;
            case "Short":break;
            case "Long":break;
            case "Float":break;
            case "Char":break;
            case "Date":break;
            default:result[0]="1";
        }
        return result;
    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
    }
}
