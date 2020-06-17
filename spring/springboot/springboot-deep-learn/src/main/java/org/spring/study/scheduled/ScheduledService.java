package org.spring.study.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    @Scheduled(fixedRate = 5000)
    public void task1(){
        System.out.println(System.currentTimeMillis());
    }
    @Scheduled(cron = "0/5 * * ? * *")
    public void task2(){
        System.out.println("cron +" + System.currentTimeMillis());
    }
}
