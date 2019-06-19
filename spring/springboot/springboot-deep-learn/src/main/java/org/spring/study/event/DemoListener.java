package org.spring.study.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听类
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();
        System.out.println("成功监听msg = "+msg);
    }
}
