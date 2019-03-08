package org.spring.study.baseconfig.conditional;

public class LinuxService implements SystemService {
    @Override
    public void hello() {
        System.out.println("linux");
    }
}
