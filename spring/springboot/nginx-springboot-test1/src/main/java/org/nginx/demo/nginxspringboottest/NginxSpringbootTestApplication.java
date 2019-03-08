package org.nginx.demo.nginxspringboottest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
@RestController
public class NginxSpringbootTestApplication {
    Logger logger = LoggerFactory.getLogger(NginxSpringbootTestApplication.class);
    public static ConcurrentHashMap map = new ConcurrentHashMap();
    @RequestMapping("/")
    public String hello() throws InterruptedException {
        Integer count = (Integer) map.get("count");
        if(count==null){
            count=1;
            map.put("count",count);
        }else{
            map.put("count",++count);
        }
        logger.info("hello this is 18080 port count = "+count);
        return "hello this is 18080 port count = "+count+";\r\n";
    }
    public static void main(String[] args) {
        SpringApplication.run(NginxSpringbootTestApplication.class, args);
    }
}

