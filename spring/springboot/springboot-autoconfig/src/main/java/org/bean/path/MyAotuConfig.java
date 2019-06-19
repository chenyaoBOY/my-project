package org.bean.path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(MyAutoConfigBeanServiceProperties.class)
@ConditionalOnClass(MyAutoConfigBeanService.class)
@ConditionalOnProperty(prefix = "cy.auto",value = "enabled",matchIfMissing = false)
public class MyAotuConfig {

    @Autowired
    private MyAutoConfigBeanServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public MyAutoConfigBeanService myAutoConfigBeanService(){
        MyAutoConfigBeanService service = new MyAutoConfigBeanService();
        service.setMsg(properties.getMsg());
        return service;
    }
}
