package org.springboot.study.config;

import com.alibaba.fastjson.JSONObject;
import org.springboot.study.entity.ComputerUser;
import org.springboot.study.entity.UserChina;
import org.springboot.study.entity.UserJapan;
import org.springboot.study.entity.UserParent;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.DelegatingFilterProxyRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.filter.DelegatingFilterProxy;

/**
 * @author chenyao
 * @date 2020/6/28 17:52
 * @description
 */
@Configuration
public class BeanConfig {

    @Bean
    public UserChina userChina(ApplicationArguments args){
        System.out.println(JSONObject.toJSONString(args.getSourceArgs()));
        UserChina userChina = new UserChina();
        userChina.setName("陈瑶");
        userChina.setCountry("China");
        System.out.println("bean初始化");
        return userChina;
    }

    @Bean
    @ConditionalOnMissingBean(UserParent.class)
    public UserJapan userJapan(){
        return new UserJapan();
    }


    /**
     * 感觉没啥意义
     * @return
     */
    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
//        System.out.println("System.exit()方法被调用了");
        return () -> 10000;
    }


    /**
     * 使用@ConfigurationProperties注解可以直接填充bean字段
     */
    @Bean
    @ConfigurationProperties(prefix = "computer.user")
    public ComputerUser computerUser(){
        return new ComputerUser();
    }

//    @Bean
//    public DelegatingFilterProxyRegistrationBean delegatingFilterProxyRegistrationBean(){
//
//        return new DelegatingFilterProxyRegistrationBean();
//    }
}
