package org.spring.study.baseconfig.beanInitAndDestroy;


public class DemoBean {

    public void init(){
        System.out.println("demoBean初始化开始");
    }
    public void hello(){
        System.out.println("hello world! ");
    }
    public void destroy(){
        System.out.println("demoBean结束生命周期");
    }
}
