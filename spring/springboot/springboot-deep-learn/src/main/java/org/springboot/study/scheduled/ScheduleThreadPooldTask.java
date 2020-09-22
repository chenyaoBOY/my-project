package org.springboot.study.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author chenyao
 * @date 2020/9/1 10:30
 * @description
 */
@Component
public class ScheduleThreadPooldTask implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(ScheduleThreadPooldTask.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("============ScheduledTask定时任务启动================");
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);
        executor.scheduleAtFixedRate(() -> {
            logger.info("线程池形式的定时任务执行 30s一次"+System.currentTimeMillis()/1000);
            String s =null;
            s.getBytes();//异常被吃了
        },0,3, TimeUnit.SECONDS);
    }
}
