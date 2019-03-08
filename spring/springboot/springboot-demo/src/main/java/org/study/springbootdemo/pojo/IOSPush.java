package org.study.springbootdemo.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @Description: IOS消息封装
 * @date 2018/6/27/17:04
 */
public class IOSPush implements Serializable{

    private Map<String,Object> alert;//通知内容
    private String sound;//声音
    private int badge;//角标数量
    private Map<String,Object> extras;//附加内容

    public IOSPush(){

    }
    /**
     *
     * @param extrasContent 通知的附加内容 不展示
     * @param totalMessage  消息未读总数量
     * @param alert   IOS通知栏显示内容
     */
    public IOSPush(Map<String,Object> alert,int totalMessage,Map<String,Object> extrasContent){
        this.badge = totalMessage;
        this.extras = extrasContent;
        this.alert = alert;
        this.sound = "sound.caf";//声音
    }

    public Map<String, Object> getAlert() {
        return alert;
    }

    public void setAlert(Map<String, Object> alert) {
        this.alert = alert;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }

    public Map getExtras() {
        return extras;
    }

    public void setExtras(Map extras) {
        this.extras = extras;
    }
}
