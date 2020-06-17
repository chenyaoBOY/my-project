package org.rest.encode.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author chenyao
 * @date 2020/5/25 10:16
 * @description
 */
@RestController
@SpringBootApplication
public class RestApp {

    @GetMapping("/getString")
    public String getString() throws UnsupportedEncodingException {
        String name = "sdg123刻sdgas录机阿萨德刚啥打开两个sdgadsgasdgdag";
        String s = new String(name.getBytes(), "UTF-16");
        return s;
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApp.class,args);
    }
}
