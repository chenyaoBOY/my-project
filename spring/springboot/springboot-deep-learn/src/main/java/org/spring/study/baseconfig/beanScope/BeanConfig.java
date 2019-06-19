package org.spring.study.baseconfig.beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.study.baseconfig.beanScope")
public class BeanConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        SingleBean singleBean1 = context.getBean(SingleBean.class);
        SingleBean singleBean2 = context.getBean(SingleBean.class);
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);

        System.out.println(singleBean1.equals(singleBean2));
        System.out.println(prototypeBean1.equals(prototypeBean2));
    }
}
