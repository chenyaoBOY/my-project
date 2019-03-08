package org.study.springbootdemo.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @Description: 安卓消息封装
 * @date 2018/6/27/17:04
 */
public class AndroidPush implements Serializable{

    private String alert;//消息内容
    private String title;//消息标题
    private Map<String,Object> extras;//附加消息

    public AndroidPush(){

    }
    /**
     *
     * @param title 通知栏标题
     * @param alert 通知栏内容
     * @param extrasContent 附加内容 不展示
     */
    public AndroidPush(String title,String alert,Map<String,Object> extrasContent){
        this.title = title;
        this.alert = alert;
        this.extras=extrasContent;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map getExtras() {
        return extras;
    }

    public void setExtras(Map extras) {
        this.extras = extras;
    }
}
