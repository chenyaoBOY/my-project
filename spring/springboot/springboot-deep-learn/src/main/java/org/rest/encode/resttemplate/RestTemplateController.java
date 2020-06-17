package org.rest.encode.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Arrays;

/**
 * @author chenyao
 * @date 2020/5/25 10:19
 * @description
 */
@SpringBootApplication
@RestController
public class RestTemplateController {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/rest")
    public String  rest() throws UnsupportedEncodingException {
        String url = "http://localhost:8080/getString";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        // 获取响应的状态
        HttpStatus statusCode = entity.getStatusCode();
        // 获取响应的header信息
        HttpHeaders headers = entity.getHeaders();
        // 获取响应的body信息
        String msg = entity.getBody();
        String s = new String(msg.getBytes("utf-16"), "utf-8");
        return s;
    }


    public static void main(String[] args) {
        SpringApplication.run(RestTemplateController.class,args);
    }
}
