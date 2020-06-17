package org.spring.study.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskRejectedException;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
@ComponentScan("org.spring.study.thread")
public class TaskExcutorConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(10);
        RejectedExecutionHandler reject = new ThreadPoolExecutor.CallerRunsPolicy();
        executor.setRejectedExecutionHandler(reject);
        executor.initialize();
        return executor;
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExcutorConfig.class);

        AsyncTaskBean bean = context.getBean(AsyncTaskBean.class);

        for (int i = 0; i < 100; i++) {
//            Thread.sleep(50);
            try {
                bean.executeTask(i);//异步执行
            } catch (TaskRejectedException e) {
                System.out.println("线程池队列已达到最大 i =" +i);
            }
        }

        context.close();
    }
}
