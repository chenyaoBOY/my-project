package org.spring.study.baseconfig.di.elDI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

//注入demoService.demo  需要@Configuration @ComponentScan两个注解 且demo需要提供get方法
@Configuration
@ComponentScan("org.spring.study.baseconfig.di.elDI")
@PropertySource("el-config.properties")
public class ElConfig {

    @Value("注入普通字符串")
    private String commomStringValue;
    @Value("#{systemProperties['os.name']}")
    private String osName;//注入系统属性 #{}
    @Value("#{T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;//注入表达式的值
    @Value("#{demoService.demo}")
    private String demo;//注入其他bean的属性
    @Value("${book.name}")
    private String bookName;//注入 配置文件properties中的key ${}
    @Value("https://www.baidu.com")
    private Resource resource;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig bean = context.getBean(ElConfig.class);
        System.out.println(bean.commomStringValue);
        System.out.println(bean.osName);
        System.out.println(bean.randomNumber);
        System.out.println(bean.demo);
        System.out.println(bean.bookName);
    }


}
