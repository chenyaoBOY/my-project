package org.springboot.study.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/7/9 15:21
 * @description
 */
@Component
public class ApplicationStatePublish {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void checkStatus(){
        try {

        }catch (Exception e){
            /**
             * 当发生某个异常 认为容器状态可能不对 需要更新容器状态 通过发布事件更新
             * {@link ReadinessStateExporter#onStateChange(org.springframework.boot.availability.AvailabilityChangeEvent)}
             * springboot官方文档提示：
             * We can also update the state of the application, when the application breaks and cannot recover:
             */
            AvailabilityChangeEvent.publish(eventPublisher,e, LivenessState.BROKEN);
        }
    }
}
