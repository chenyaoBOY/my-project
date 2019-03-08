package org.spring.study.baseconfig.conditional;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.spring.study.baseconfig.conditional")
public class ConditionalConfig {

    @Bean
    @Conditional(LinuxCondition.class)
    public SystemService linuxService(){
        return new LinuxService();
    }
    @Bean
    @Conditional(WindowCondition.class)
    public SystemService windowService(){
        return new WindowService();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        SystemService bean = context.getBean(SystemService.class);
        bean.hello();
    }
}
