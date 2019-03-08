package org.spring.study.thread;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.task.TaskRejectedException;

public class Main {

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
