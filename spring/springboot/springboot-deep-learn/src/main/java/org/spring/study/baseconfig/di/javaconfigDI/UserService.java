package org.spring.study.baseconfig.di.javaconfigDI;

public class UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public String hello(String world){
        return userMapper.hello(world);
    }
}
