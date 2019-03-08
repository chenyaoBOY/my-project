package org.study.springbootdemo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/10/15:34
 */
public class CYTEst {

    @Test
    public void test92(){
         ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>(8);

        String res = map.putIfAbsent("1", "1");
        String res2 = map.putIfAbsent("1", "2");
        String res3 = map.putIfAbsent("1", "3");
        System.out.println(123);

    }
    @Test
    public void test01() throws IOException {
        String url = "http://test.uway-fdl.com/ulian/openApiController.do?findHkxxListByFd";
        String json = "{\"requestTime\":\"2018-11-09 15:35:48\",\"sign\":\"f28b11e61ee2ece1d77f557d4a9dfa1b\",\"name\":\"赵桂根\",\"idno\":\"330121195702151134\"}";
        HttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        HttpEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
        post.setEntity(entity);

        HttpResponse httpResponse = client.execute(post);

        StringBuffer buffer = new StringBuffer();
        InputStream content = null;
        try {
            content = httpResponse.getEntity().getContent();
            byte[] b = new byte[1024];
            int len ;
            while ((len = content.read(b))>0){
                buffer.append(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(buffer.toString());

    }
}
