package org.springboot.study;

import org.bean.path.MyAutoConfigBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 */
@SpringBootApplication
@RestController
public class App {


    @Value("${book.name}")
    String name;

    @Autowired
    Book book;

    @Autowired
    MyAutoConfigBeanService service;

    @RequestMapping("/")
    String home(){
        return "hello spring-boot  " + "=="+service.getMsg()
                + book.getName() + " "+book.getAuthor();
    }
    @RequestMapping("/home")
    String hello(){
        return "home";
    }

    @Bean
    public GlobalFilter globalFilter(){
        return new GlobalFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
