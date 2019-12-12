package org.study.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.study.springbootdemo.pojo.Person;
import org.study.springbootdemo.pojo.PersonVo;
import org.study.springbootdemo.service.UserService;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @Description: 用于验证各种测试结果和问题
 * @date 2018/6/19/10:41
 */
@Controller
public class TestController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @Resource(name = "userService")
    private UserService userService2;

    @InitBinder
    public void init(WebDataBinder wb){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        wb.registerCustomEditor(Date.class,new CustomDateEditor(df,true));

    }

    @RequestMapping("/test")
    public String pageCertification(ModelMap map){
        map.put("person", JSONObject.toJSONString(new Person()));
        return "test";
    }

    @RequestMapping("/date.do")
    @ResponseBody
    public PersonVo dateTypeTransform(PersonVo vo){
        return vo;
    }

    @RequestMapping("/service/orm")
    @ResponseBody
    public String orm(){
//        String username = userService.getUsername("!23");
//        String username2 = userService2.getUsername("!23");
        return null;
    }

    @RequestMapping("/map")
    @ResponseBody
    public Map map(){
     Map map = new HashMap();
     map.put("name","cy");

     return map;
    }
}
