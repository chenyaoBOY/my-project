package org.spring.study.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Action("获取用户名")
    public String getUserName(){
        System.out.println("tom");
        return "tom";
    }
}
