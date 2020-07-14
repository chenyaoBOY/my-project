package org.springboot.study.application;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/7/9 15:03
 * @description
 */
@Component
public class ReadinessStateExporter {

    /**
     * 监听容器的状态
     * 容器是否允许外部流量进入
     * 容器状态也可以通过自行更新 见{@link ApplicationStatePublish#checkStatus}
     * @param event
     */
    @EventListener
    public void onStateChange(AvailabilityChangeEvent event){
        switch (event.getState().toString()){
            case "CORRECT":
                System.out.println("当前容器状态:CORRECT 正确启动 time:"+System.currentTimeMillis());
                break;
            case "BROKEN":
                System.out.println("当前容器状态:BROKEN 容器已死亡");
                break;
            case "REFUSING_TRAFFIC":
                System.out.println("当前容器状态:REFUSING_TRAFFIC 拒绝流量");
                break;
            case "ACCEPTING_TRAFFIC":
                System.out.println("当前容器状态:ACCEPTING_TRAFFIC 可以接受流量 time:"+System.currentTimeMillis());
                break;
        }
    }

}
