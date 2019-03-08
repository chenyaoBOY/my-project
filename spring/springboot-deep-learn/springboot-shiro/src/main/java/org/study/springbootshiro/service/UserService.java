package org.study.springbootshiro.service;

import org.springframework.stereotype.Service;
import org.study.springbootshiro.shiro.bean.UserInfo;

@Service
public class UserService {

    public UserInfo findByUsername(String username){
        UserInfo user = new UserInfo();
        user.setName("admin");
        user.setUid(1);
        user.setPassword("123456");
        return user;
    }
}
