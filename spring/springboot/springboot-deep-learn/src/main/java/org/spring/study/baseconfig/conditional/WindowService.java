package org.spring.study.baseconfig.conditional;

public class WindowService implements SystemService {
    @Override
    public void hello() {
        System.out.println("window");
    }
}
