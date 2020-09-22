package org.springboot.study.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.*;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author chenyao
 * @date 2020/9/1 10:59
 * @description
 */
@Component
@EnableScheduling
@Configuration
public class ScheduleAnnotationTaskConfig  {
    private Logger logger = LoggerFactory.getLogger(ScheduleAnnotationTaskConfig.class);

    @Bean
    public TaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(5);
        taskScheduler.setThreadNamePrefix("Spring-Task-T");
        return  taskScheduler;
    }
    @Scheduled(cron = "0/5 * * ? * *")
    public void doTask(){
        logger.info("注解形式的定时任务1:{}",System.currentTimeMillis()/1000);
//        String i =null;
//        i.getBytes();//异常可以报出
    }
    @Scheduled(cron = "0/5 * * ? * *")
    public void doTask2() throws InterruptedException {
        logger.info("注解形式的定时任务2:{}",System.currentTimeMillis()/1000);
        Thread.sleep(10_000);//下次任务执行需要等待上次任务执行结束
    }

}
