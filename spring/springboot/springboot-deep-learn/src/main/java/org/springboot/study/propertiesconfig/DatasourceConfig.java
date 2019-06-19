package org.springboot.study.propertiesconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author chenyao
 * @date 2019/6/14 10:45
 * @description
 */

@ConfigurationProperties(prefix = "spring.datatsource")
@Component
public class DatasourceConfig {
    private String username;
    private String password;
    private String driver_class_name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver_class_name() {
        return driver_class_name;
    }

    public void setDriver_class_name(String driver_class_name) {
        this.driver_class_name = driver_class_name;
    }
}
