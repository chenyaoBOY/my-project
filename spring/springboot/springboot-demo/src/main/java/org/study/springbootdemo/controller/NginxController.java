package org.study.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class NginxController {

    @RequestMapping("/nginx")
    public String nginx(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        String realIP = request.getHeader("X-Real-IP");
        String forward = request.getHeader("X-Forwarded-For");
        String Host = request.getHeader("Host");

        PrintWriter writer = response.getWriter();

        writer.println("remoteAddr:"+remoteAddr);
        writer.println("remoteHost:"+remoteHost);
        writer.println("Host:"+Host);
        writer.println("realIP:"+realIP);
        writer.println("forward:"+forward);

        return null;
    }
}
