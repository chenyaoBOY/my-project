package org.study.project.redis;
import java.util.*;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.*;

/**
 * @author chenyao
 * @date 2019/8/1 16:03
 * @description
 */
public class JedisUtil {
    public static final JedisPool pool ;
    public static final Jedis JEDIS ;

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        // 1.1 最大连接数
        config.setMaxTotal(30);
        //1.2 最大空闲连接数
        config.setMaxIdle(10);
        pool = new JedisPool(config, "10.103.16.184",16379,10000000,"dddddd");
//        pool = new JedisPool(config, "192.168.1.131",6379,100000);
        JEDIS = pool.getResource();
    }
    public static void main(String[] args) {
//        Long setnx = JEDIS.setnx("nameList", "jiafu");
//        System.out.println(setnx);
//        JEDIS.hset("GROUP_ORDER_INWH","warehouse","广州仓");
//        String hget = JEDIS.hget("GROUP_ORDER_INWH", "warehouse");
//   |     System.out.println(hget);
//        String key = "cy_test_key:";
//        String key1 = key+"count";
//        String key2 = key+"list";
//        String key3 = key+"188";
//        String key4 = key+"88";
//        JEDIS.set(key1,"288");
//        JEDIS.set(key2,"10");
//        JEDIS.set(key3,"180");
//        JEDIS.lpush(key4,"{name1:cy}");
//
//        JEDIS.close();
//        System.out.println(JEDIS.llen("XCX_LOTTERY_KEY:ALL_CARD"));
//        System.out.println(JEDIS.lpop("XCX_LOTTERY_KEY:ALL_CARD"));
        JEDIS.lpush("XCX_LOTTERY_KEy1","1");
        System.out.println(JEDIS.lpop("XCX_LOTTERY_KEy1"));
        System.out.println(JEDIS.lpop("XCX_LOTTERY_KEy1"));
        System.out.println(JEDIS.lpop("XCX_LOTTERY_KEy1"));
        System.out.println(JEDIS.lpop("XCX_LOTTERY_KEy1"));
    }

    @Test
    public void test(){
        String nx = JEDIS.set("distribution_lock", UUID.randomUUID().toString(), "NX", "EX", 3);
        System.out.println(nx);
    }
    @Test
    public void group() {
        JEDIS.set("COMPANY:DEPT:EMPLOYEE:name","xiangbi");
    }

    /**
     * 排序
     * @return
     */
    @Test
    public void sortListByRedis(){
//        List<Integer> list = Arrays.asList(1,11,2,23,12,14);
//        JEDIS.rpush("numberList","1","11","2","23","12","14","4");
        List<String> lrange = JEDIS.lrange("numberList", 0, JEDIS.llen("numberList"));
        System.out.println(lrange);
        List<String> numberList = JEDIS.sort("numberList");
        System.out.println(numberList);
        SortingParams sort = new SortingParams();
        List<String> numberList1 = JEDIS.sort("numberList", sort.desc());
        System.out.println(numberList1);

    }


    public static Jedis getJedis(){
        return pool.getResource();
    }
    /**
     * 获取指定key的value
     * @param key
     * @return
     */
    public static String get(String key){
        String s = JEDIS.get(key);
        System.out.println(s);
        return s;
    }
    /**
     * 关闭连接
     * @return
     */
    public static boolean close(){
        try {
            JEDIS.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Test
    public void publish(){
        JEDIS.publish("channel_1","hello everyone");
    }

    @Test
    public void subscribe() {
        JedisPubSub sub = new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.println("message="+message+" channel="+channel);

            }
        };
        sub.proceed(new Client("192.168.1.131",6379),"channel_1");
        JEDIS.subscribe(sub,"channel_1");
        while (true){

        }
    }
}
