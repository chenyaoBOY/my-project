package org.study.project.spi;

import java.util.ServiceLoader;

/**
 * @author chenyao
 * @date 2020/8/20 14:54
 * @description
 */
public class SpiApp {
    public static void main(String[] args) {

        ServiceLoader<DemoService> services = ServiceLoader.load(DemoService.class);

        for (DemoService service : services) {
            System.out.println(service.sayHello());
        }

    }
}
