package org.springboot.study;

import org.bean.path.MyAotuConfig;
import org.bean.path.MyAutoConfigBeanService;
import org.springboot.study.propertiesconfig.Book;
import org.springboot.study.propertiesconfig.CpxLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;


/**
 * Hello world!
 */
//@SpringBootApplication
//@RestController
public class App implements AppInterface {

    @Value("${app.name:yaoyao}")
    String name;
    @Value("${log.name}")
    String logName;

    @Autowired
    Book book;
    @Autowired
    CpxLocation cpx;
    @Autowired
    MyAutoConfigBeanService service;

    @RequestMapping("/")
    String home(){
        return "msg="+service.getMsg()+ " \n name="+name
                + " \n book.name="+book.getName() + "\n book.author= "+book.getAuthor()+
                "\n cpx="+cpx.getLocation();
    }
    @RequestMapping("/home")
    String hello(){
        return logName;
    }
    @DeleteMapping(value = "/delete",consumes = "application/json")
    public String delete(@RequestBody String json){
        return json;
    }
    @PutMapping(value = "/post",consumes = "application/json")
    public String post(@RequestBody  String json){
        return json;
    }

    @Bean
    public GlobalFilter globalFilter(){
        return new GlobalFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @Override
    public String queryInfo() {
        return "queryInfo";
    }
}
