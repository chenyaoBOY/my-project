package org.spring.study.baseconfig.di.javaconfigDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService bean = context.getBean(UserService.class);
        System.out.println(bean.hello("world"));
    }
}
