package org.study.swagger.controller.group2;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "第二组")
@RestController
public class Test2Controller {

    @RequestMapping(value = "/test2/{msg}",method =RequestMethod.POST)
    public String test(@PathVariable String msg){

        return "您输入的信息："+msg;
    }

    @RequestMapping(value = "/query2",method = RequestMethod.GET)
    public String query(){
        return "query result";
    }
}
