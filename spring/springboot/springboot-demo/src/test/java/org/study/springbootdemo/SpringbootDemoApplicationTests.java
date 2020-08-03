package org.study.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.ConnectException;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringbootDemoApplication.class)
public class SpringbootDemoApplicationTests {
//
//    @Autowired
//    RestTemplate restTemplate;

    @Test
    public void contextLoads() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(3*1000);
//        factory.setConnectTimeout(2*1000);
//        RestTemplate restTemplate = new RestTemplate(factory);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:18080/jsonValidate.do";
        long start =  System.currentTimeMillis();
        try {
            ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class);
            System.out.println(exchange.getBody());
        } catch (ResourceAccessException e) {
            System.out.println(System.currentTimeMillis()-start);
            e.printStackTrace();
        } catch (RestClientException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
