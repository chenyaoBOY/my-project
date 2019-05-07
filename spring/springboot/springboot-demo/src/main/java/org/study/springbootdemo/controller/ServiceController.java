package org.study.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.springbootdemo.service.impl.UserServiceImpl;

@RestController
public class ServiceController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping("/rest/find/all")
    public String getAll(){
        return "copy your request and send your this message!";
    }
}
