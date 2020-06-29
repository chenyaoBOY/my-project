package org.springboot.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyao
 * @date 2020/6/19 17:50
 * @description
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {


    @GetMapping("/error/before")
    public String catchErrorBefore(@RequestParam String name){
        int i  = 1/0;
        return "ok"+name;
    }
}
