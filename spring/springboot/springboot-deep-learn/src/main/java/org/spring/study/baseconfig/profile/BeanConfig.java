package org.spring.study.baseconfig.profile;

import org.springframework.context.annotation.*;

/**
 * 不同环境下获取不同的bean
 */
@Configuration
@ComponentScan("org.spring.study.baseconfig.profile")
public class BeanConfig {
    @Bean
    @Profile("dev")
    public DemoBean demoBeanDev(){
        return new DemoBean("dev");
    }
    @Bean
    @Profile("pro")
    public DemoBean demoBeanPro(){
        return new DemoBean("pro");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置环境
        context.getEnvironment().setActiveProfiles("pro");
        context.register(BeanConfig.class);
        context.refresh();
        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());
    }
}
