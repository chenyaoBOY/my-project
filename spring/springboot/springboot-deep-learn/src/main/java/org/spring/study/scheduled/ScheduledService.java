package org.spring.study.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    Logger logger = LoggerFactory.getLogger(ScheduledService.class);

    @Scheduled(fixedRate = 5000)
    public void task1() {
        logger.info("fixedRate:{}", System.currentTimeMillis());
    }

    @Scheduled(cron = "0/3 * * ? * *")
    public void task2() {
        logger.info("cron1 :{}", System.currentTimeMillis()/1000);
    }
    @Scheduled(cron = "0/3 * * ? * *")
    public void task3() throws InterruptedException {
        logger.info("cron2 :{}", System.currentTimeMillis()/1000);
        Thread.sleep(6000);
    }
}
