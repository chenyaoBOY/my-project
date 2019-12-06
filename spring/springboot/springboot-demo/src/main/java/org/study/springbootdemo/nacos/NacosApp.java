package org.study.springbootdemo.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenyao
 * @date 2019/12/6 10:34
 * @description
 */
@SpringBootApplication
@NacosPropertySource(dataId = "first",autoRefreshed = true)
public class NacosApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosApp.class,args);
    }
}
