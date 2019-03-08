package org.study.springbootdemo.service.impl;

import org.springframework.stereotype.Service;
import org.study.springbootdemo.auto_api.annotation.AutoApi;
import org.study.springbootdemo.pojo.Person;
import org.study.springbootdemo.service.UserService;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author chenyao
 * @Description:
 * @date 2018/6/30/9:37
 */
@Service("userService")
@AutoApi("UserService")
public class UserServiceImpl implements UserService {


    @Override
    public List<String> getUsername(String name, int id, double d, byte a, short s, Integer num, BigDecimal b) {
        return null;
    }

    @Override
    public void getUserName2() {

    }

    @Override
    public Person getUserName3(Person person) {
        return null;
    }
}
