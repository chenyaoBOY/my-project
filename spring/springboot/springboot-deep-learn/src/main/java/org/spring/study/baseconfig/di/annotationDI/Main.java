package org.spring.study.baseconfig.di.annotationDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解配置形式依赖注入
 *
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        DemoUseService service = context.getBean(DemoUseService.class);

        String beauty = service.sayHello("beauty");
        System.out.println(beauty);
    }
}
