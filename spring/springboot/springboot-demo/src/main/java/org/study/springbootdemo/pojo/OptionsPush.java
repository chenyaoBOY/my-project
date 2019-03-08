package org.study.springbootdemo.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @Description:
 *      IOS 消息推送配置
 * @date 2018/6/27/17:04
 */
public class OptionsPush implements Serializable{

    /**
     * 推送环境配置
     *      false:开发环境
     *      true:生产环境
     */
    private boolean apns_production ;

    public  OptionsPush(boolean apns_production){
        this.apns_production = apns_production;
    }

    public boolean isApns_production() {
        return apns_production;
    }

    public void setApns_production(boolean apns_production) {
        this.apns_production = apns_production;
    }
}
