package org.study.springbootdemo.auto_api;

import java.util.List;

public class MethodContent<T> {

    private String methodName;//方法名
    private List<BeanContent> paramList;//参数集合
    private String returnType;//返回类型
    private T returnValue;//返回值内容

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public List<BeanContent> getParamList() {
        return paramList;
    }

    public void setParamList(List<BeanContent> paramList) {
        this.paramList = paramList;
    }

}
