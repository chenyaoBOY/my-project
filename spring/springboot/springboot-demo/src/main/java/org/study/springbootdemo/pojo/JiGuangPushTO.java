package org.study.springbootdemo.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @Description: 极光推送 数据传输类
 * @date 2018/6/28/14:16
 */
public class JiGuangPushTO implements Serializable{

    private String title ="资源共享平台";//消息内容
    private String alert ="您有一条新的消息";//消息内容
    private int totalMessage = 0;//未读消息总数量
    private Map<String,Object> extras = new HashMap<>();//附加消息内容
    private AudiencePush  audiencePush = new AudiencePush();//推送设备范围设定

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public int getTotalMessage() {
        return totalMessage;
    }

    public void setTotalMessage(int totalMessage) {
        this.totalMessage = totalMessage;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    public AudiencePush getAudiencePush() {
        return audiencePush;
    }

    public void setAudiencePush(AudiencePush audiencePush) {
        this.audiencePush = audiencePush;
    }
}
