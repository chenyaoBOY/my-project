package org.springboot.study.config;

import org.springboot.study.entity.UserChina;
import org.springboot.study.entity.UserJapan;
import org.springboot.study.entity.UserParent;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenyao
 * @date 2020/6/28 17:52
 * @description
 */
@Configuration
public class BeanConfig {

    @Bean
    public UserChina userChina(){
        UserChina userChina = new UserChina();
        userChina.setName("陈瑶");
        userChina.setCountry("China");
        return userChina;
    }

    @Bean
    @ConditionalOnMissingBean(UserParent.class)
    public UserJapan userJapan(){
        return new UserJapan();
    }
}
