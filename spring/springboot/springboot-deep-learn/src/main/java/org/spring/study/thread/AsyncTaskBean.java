package org.spring.study.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskBean {

    @Async
    public void executeTask(int i){
        String name = Thread.currentThread().getName();
        System.out.println(name+" == "+ i);
    }

}
