package org.study.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转专用
 */
@Controller
public class PageController {

    @RequestMapping("/certification")
    public String pageCertification(){
        System.out.println(123);
        return "certification";
    }
}
