package org.study.springbootdemo;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyao
 * @date 2020/1/16 15:48
 * @description
 */
public class HttpClientTest {
    public static void main(String[] args) throws IOException {
        HttpClient client =  HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("http://localhost:8080/c3p0/post");

        post.setHeader("Content-Type","application/json;charset=utf-8");

        Map map = new HashMap(2);
        map.put("code",0);
        map.put("msg","success");
        HttpEntity entity = new StringEntity(JSONObject.toJSONString(map));
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        String responose = getResponose(response);
        System.out.println(responose);
    }

    public static String getResponose(HttpResponse response) {
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
}
