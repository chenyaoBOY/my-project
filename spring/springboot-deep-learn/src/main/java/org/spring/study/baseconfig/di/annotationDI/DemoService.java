package org.spring.study.baseconfig.di.annotationDI;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String sayHello(String world){
        return "hello "+world;
    }
}
