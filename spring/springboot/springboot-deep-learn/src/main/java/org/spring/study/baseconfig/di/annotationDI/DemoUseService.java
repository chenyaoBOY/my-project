package org.spring.study.baseconfig.di.annotationDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoUseService {

    @Autowired
    private DemoService demoService;

    public String sayHello(String world){
        return demoService.sayHello(world);
    }
}
