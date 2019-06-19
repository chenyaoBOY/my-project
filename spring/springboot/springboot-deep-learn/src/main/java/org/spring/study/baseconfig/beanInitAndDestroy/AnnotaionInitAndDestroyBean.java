package org.spring.study.baseconfig.beanInitAndDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotaionInitAndDestroyBean {

    @PostConstruct
    public void init(){
        System.out.println("AnnotaionInitAndDestroyBean初始化开始");
    }
    public void hello(){
        System.out.println("hello world! ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("AnnotaionInitAndDestroyBean结束生命周期");
    }
}
