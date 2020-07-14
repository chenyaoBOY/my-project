package org.springboot.study.controller;

import org.springboot.study.entity.UserChina;
import org.springboot.study.config.value.MapListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @author chenyao
 * @date 2020/5/29 11:22
 * @description
 */
@RestController
@Component
public class ConfigReadController {
    @Autowired
    private MapListConfig mapConfig;
    @Autowired
    private UserChina userChina;

    @GetMapping("/map")
    public String getMapConfig(){
        for (Map.Entry<String, String> entry : mapConfig.getMap().entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (String s : mapConfig.getList()) {
            System.out.println(s);
        }
        return "ok";
    }
    @PostConstruct
    public void init(){
        System.out.println("controller初始化完成");
    }
}
