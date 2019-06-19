package org.spring.study.scheduled;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;


@Configuration
@ComponentScan("org.spring.study.scheduled")
@EnableScheduling
public class ScheduledConfig {

    @Bean
    public ScheduledExecutorService scheduledExecutorService(){
        return  new ScheduledThreadPoolExecutor(5);
    }
    @Bean
    public TaskScheduler taskScheduler(){
        return  new ThreadPoolTaskScheduler();
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
