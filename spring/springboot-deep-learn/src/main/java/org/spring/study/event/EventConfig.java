package org.spring.study.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.spring.study.event")
public class EventConfig {
    /**
     * 监听一个Bean的方法，操作步骤
     *      1.创建事件 继承ApplicationEvent
     *      2.创建发布者publisher 该类对事件的方法进行一次包装，通过ApplicationContext将事件发布出去
     *      3.创建监听者listener 实现ApplicationListener 监听发布者的操作
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        publisher.publish("发送一条消息！");

        context.close();
    }
}
