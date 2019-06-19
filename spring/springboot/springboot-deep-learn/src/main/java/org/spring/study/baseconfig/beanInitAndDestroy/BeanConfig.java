package org.spring.study.baseconfig.beanInitAndDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.study.baseconfig.beanInitAndDestroy")
public class BeanConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public DemoBean demoBean(){
        return new DemoBean();
    }
    @Bean
    public AnnotaionInitAndDestroyBean annotaionInitAndDestroyBean(){
        return new AnnotaionInitAndDestroyBean();
    }


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        DemoBean bean = context.getBean(DemoBean.class);
        AnnotaionInitAndDestroyBean bean1 = context.getBean(AnnotaionInitAndDestroyBean.class);

        context.close();
    }
}
