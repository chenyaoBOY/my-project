package org.nginx.demo.nginxspringboottest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: chenyao
 * Date: 2019/2/13 15:17
 * Description:
 */
@RestController
public class TomcatController {

    @RequestMapping("/tomcat/userInfo")
    public Map<String,String> getResult(){
        Map<String,String> map = new HashMap<>();
        map.put("name","秃头男");
        map.put("age","18");
        map.put("server","tomcat");
        map.put("address","bj");
        map.put("phone","110");
        return map;
    }

}
