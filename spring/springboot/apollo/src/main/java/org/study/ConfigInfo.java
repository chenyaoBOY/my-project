package org.study;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2020/5/22 14:12
 * @description
 */
//@ConfigurationProperties(prefix = "project.config")
//@Component
public class ConfigInfo {

    private String timeout;
    private String name;

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
