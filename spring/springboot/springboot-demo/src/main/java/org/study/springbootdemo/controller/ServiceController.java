package org.study.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.springbootdemo.service.impl.UserServiceImpl;

@RestController
public class ServiceController {

    @Autowired
    private UserServiceImpl service;

    @Value("${server.port}")
    private String msg;

    @RequestMapping("/rest/find/all")
    public String getAll(){
        return "copy your request and send your this message!"+msg;
    }
}
