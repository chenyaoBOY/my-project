package org.bean.path;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cy.auto.config")
public class MyAutoConfigBeanServiceProperties {

    private String msg = "msg";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
