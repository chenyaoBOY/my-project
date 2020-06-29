package org.springboot.study.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenyao
 * @date 2020/5/8 17:47
 * @description
 */
public interface AppInterface {

    @RequestMapping("/query")
    String queryInfo();
}
