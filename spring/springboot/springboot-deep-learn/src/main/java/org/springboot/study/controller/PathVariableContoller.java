package org.springboot.study.controller;

import org.springboot.study.util.Result;
import org.springboot.study.util.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyao
 * @date 2020/8/17 13:33
 * @description
 */
@RestController
public class PathVariableContoller {

    @GetMapping("/req/{id}/query.do")
    public Result reqIdQuery(@PathVariable("id") Integer id){
        return ResultUtil.response(200,"msg:"+id);
    }

}
