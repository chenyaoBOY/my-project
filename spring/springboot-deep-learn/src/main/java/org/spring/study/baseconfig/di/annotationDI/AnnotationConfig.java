package org.spring.study.baseconfig.di.annotationDI;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明当前类是一个配置类
@Configuration
//自动扫描包名下的注解 @Service @Repository @Controller @Component
@ComponentScan("org.spring.study.baseconfig.di.annotationDI")
public class AnnotationConfig {
}
