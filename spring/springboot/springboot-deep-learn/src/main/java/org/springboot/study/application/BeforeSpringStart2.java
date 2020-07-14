package org.springboot.study.application;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/7/9 16:24
 * @description 在spring容器启动完成后 方法退出前 加载一些事情
 * If you need to run some specific code once the SpringApplication has started,
 * you can implement the ApplicationRunner or CommandLineRunner interfaces.
 *
 * 如果有多个ApplicationRunner实现类 则可以使用 @Order注解 或者 实现Ordered接口
 */
@Component
public class BeforeSpringStart2 implements ApplicationRunner, Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("BeforeSpringStart2 是否在main方法结束前调用");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
