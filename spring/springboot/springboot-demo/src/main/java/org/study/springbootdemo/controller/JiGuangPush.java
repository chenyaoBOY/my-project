package org.study.springbootdemo.controller;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.Notification;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.springbootdemo.pojo.AndroidPush;
import org.study.springbootdemo.pojo.IOSPush;
import org.study.springbootdemo.pojo.JiGuangPushTO;
import org.study.springbootdemo.pojo.OptionsPush;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenyao
 * @Description: 极光消息推送测试
 * @date 2018/6/26/15:24
 */
@RestController
public class JiGuangPush {

    private static String AUTHORIZTION="208cf249d6ca4e7ef68bf813:1dd203f1250cc1f5af4c9a97";//正式版
//    private static String AUTHORIZTION="5ee7d3df13f49e86bbb24c24:194a2f01087221532cefa257";
    private static String JIGUANG_PUSH_URL="https://api.jpush.cn/v3/push";
    private static HttpClient httpClient = HttpClients.createDefault();

    @RequestMapping("/send")
    public String sendMessage() throws Exception {

        JiGuangPushTO to = new JiGuangPushTO();

        //标题
        to.setTitle("结算单待确认提醒");
        //内容
        to.setAlert("结算单号：AJASDGBNAG0016545");
        Map<String, Object> app_extras = new HashMap<>();
        app_extras.put("data-id","001");//订单编号
        app_extras.put("data-code",null);//供应商
        app_extras.put("data-tzid","sagaw");//通知id
        app_extras.put("data-state","sgawr");//单据类型
        app_extras.put("data-type","segw");//读取状态
        to.setExtras(app_extras);

        //设备
        List alias = new ArrayList<>();
        alias.add("18511406005");
        to.getAudiencePush().setAlias(alias);

        return sendPush(to);
    }

    public String sendPush(JiGuangPushTO to){
        HttpPost post = new HttpPost(JIGUANG_PUSH_URL);

        Map<String, Object> jsonMap = new HashMap<>();
        //平台设置
        jsonMap.put("platform","all");//所有平台

        //设置推送设备 别名配置
        jsonMap.put("audience",to.getAudiencePush());

        //设置IOS 推送的环境 生产或开发
        jsonMap.put("options",new OptionsPush(false));


        Map iosMap = new HashMap<>();
        iosMap.put("title",to.getTitle());
        iosMap.put("body",to.getAlert());
//        iosMap.put("subtitle",to.getTitle());

        // 通知信息封装
        Map<String, Object> notificationMap = new HashMap<>();
        notificationMap.put("ios",new IOSPush(iosMap,to.getTotalMessage(),to.getExtras()));
        notificationMap.put("android",new AndroidPush(to.getTitle(),to.getAlert(),to.getExtras()));
//        notificationMap.put("alert","通用消息！");//ios没有声音
        jsonMap.put("notification",notificationMap);


        // post参数设置
        String json = JSONObject.toJSONString(jsonMap);
        HttpEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
        post.setEntity(entity);

        //密文封装
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String encode = base64Encoder.encode(AUTHORIZTION.getBytes());
        post.setHeader("Authorization","Basic "+encode);

        //访问远程接口
        HttpResponse response = null;
        try {
            response = httpClient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //{"error":{"code":1003,"message":"Audience value is invalid"}}
        String responose = getResponose(response);

        return responose+"      >>>>>>>>>>>>>>>>>>>>>>>   "+json;
    }
    public String getResponose(HttpResponse response) {
        StringBuffer buffer = new StringBuffer();
        InputStream content = null;
        try {
            content = response.getEntity().getContent();
            byte[] b = new byte[1024];
            int len ;
            while ((len = content.read(b))>0){
                buffer.append(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    @RequestMapping("/api/{type}")
    public String api(@PathVariable int type) throws APIConnectionException, APIRequestException {

        PushResult result = Jiguang.sendPush(type);
        return result.toString();
    }

}
 class Jiguang {
    static JPushClient jPushClient=null;
    static String masterSecret="1dd203f1250cc1f5af4c9a97";
    static String appKey="208cf249d6ca4e7ef68bf813";
    static {
        jPushClient =new JPushClient(masterSecret, appKey);
    }
    public static PushPayload sendMessage(Integer type){

        PushPayload.Builder builder = PushPayload.newBuilder();
        //平台
        builder.setPlatform(Platform.all());
        //接收者
//        builder.setAudience(Audience.alias("17310598281"));
        builder.setAudience(Audience.all());

        builder.setNotification(Notification.alert("您有一条新的消息!"));
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",30);
        map.put("message","消息内容！");
        builder.setMessage(Message.content(JSONObject.toJSONString(map)));
        //获取
        PushPayload build = builder.build();

        return build;
    }
    public static PushResult sendPush(Integer type) throws APIConnectionException, APIRequestException {
        PushPayload payload = Jiguang.sendMessage(type);
        PushResult result = Jiguang.jPushClient.sendPush(payload);

        return result;
    }
}
