package org.spring.study.baseconfig.di.javaconfigDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public UserMapper userMapper(){
        return new UserMapper();
    }
    @Bean
    public UserService userService(){
        UserService userService = new UserService();
        userService.setUserMapper(userMapper());
        return userService;
    }
}
