package org.springboot.study;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author chenyao
 * @date 2020/6/19 17:47
 * @description
 */
@SpringBootApplication
public class SpringbootApp {

    /**
     * 如果想在项目中使用args参数
     * 请注入：ApplicationArguments
     * {@link org.springboot.study.config.BeanConfig#userChina(ApplicationArguments)}
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class,args);
        System.out.println("springboot完全启动成功 main方法结束");
    }
}
