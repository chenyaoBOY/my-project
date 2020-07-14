package org.springboot.study.config.value;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2019/6/14 10:29
 * @description
 */
@ConfigurationProperties(prefix = "cpxlocation")
@Component
public class CpxLocation {
    private String location;
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
