package org.study.springbootdemo.service;


import org.study.springbootdemo.pojo.Person;

import java.math.BigDecimal;
import java.util.List;


public interface UserService {

    List<String> getUsername(String name, int id, double d, byte a, short s, Integer num, BigDecimal b);

    void getUserName2();

    Person getUserName3(Person person);
}
