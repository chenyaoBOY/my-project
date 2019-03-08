package org.nginx.demo.nginxspringboottest2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: chenyao
 * Date: 2019/2/13 15:21
 * Description:
 */

@RestController
public class JettyController {

    @RequestMapping("/jetty/hairInfo")
    @ResponseBody
    public Map<String,String> getResult(){
        Map<String,String> map = new HashMap<>();
        map.put("productName","植发");
        map.put("price","20一根");
        map.put("question","值不值？植不植");
        map.put("server","jetty");
        return map;
    }
}
