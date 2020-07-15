package org.springboot;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.study.SpringbootApp;
import org.springboot.study.config.value.ConstructorBindingValue;
import org.springboot.study.config.value.MapListConfig;
import org.springboot.study.entity.ComputerUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author chenyao
 * @date 2020/7/14 17:01
 * @description
 */
@SpringBootTest(classes = SpringbootApp.class)
@RunWith(SpringRunner.class)
public class ValueTest {

    @Autowired
    private ConstructorBindingValue constructorBindingValue;
    @Autowired
    private MapListConfig mapListConfig;
    @Autowired
    private ApplicationContext applicationContext;
    @Autowired
    private ComputerUser computerUser;

    @Test
    public void injectConstructValue(){
        String address = constructorBindingValue.getAddress();
        System.out.println(address);
        System.out.println(constructorBindingValue.getAge());
        List<String> list = mapListConfig.getList();
        System.out.println(JSONObject.toJSONString(list));


        String[] beanNamesForType = applicationContext.getBeanNamesForType(ConstructorBindingValue.class);
        System.out.println(JSONObject.toJSONString(beanNamesForType));

        System.out.println(JSONObject.toJSONString(computerUser));
    }
}
