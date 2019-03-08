package org.study.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/rest/find/all")
    public String getAll(){
        return "copy your request and send your this message!";
    }
}
