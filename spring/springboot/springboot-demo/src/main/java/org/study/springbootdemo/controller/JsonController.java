package org.study.springbootdemo.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class JsonController {


    @RequestMapping("jsonValidate.do")
    public String jsonValidate(){
        HashMap<Object, Object> map = new HashMap<>();
        map.put("key","门导轮(小带轮) <n30>");
        try {
            Thread.sleep(1000*200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return JSONObject.toJSONString(map);
    }
}
