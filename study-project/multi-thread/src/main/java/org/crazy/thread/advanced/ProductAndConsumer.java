package org.crazy.thread.advanced;

import org.junit.Test;
import sun.dc.pr.PRError;

/**
 * @author chenyao
 * @date 2019/5/17 17:18
 * @description 使用synchronized、wait、notifyAll 模拟生产者消费者
 */
public class ProductAndConsumer {
    public static final int MAX_VALUE = 10;
    public static final int MIN_VALUE = 0;
    public static volatile int productNum = 0;
    public static Object obj = new Object();
    public static int f = 1;

    @Test
    public void main() {
        //生产者
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    product();
                }
            }
        }).start();
        //消费者
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    consumer();
                }
            }
        }).start();
        while (true) {
        }
    }

    public void product() {
        synchronized (obj) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (productNum >= MAX_VALUE) {
                try {
                    System.out.println("生产数量已达最大值！等待消费");
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            productNum++;
            System.out.println("生产第" + productNum + "件商品，通知消费者消费");
            obj.notifyAll();
        }
    }

    public void consumer() {
        synchronized (obj) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (productNum <= MIN_VALUE) {
                try {
                    System.out.println("全部消费完毕！等待生产");
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费第" + productNum + "件商品，通知生产者继续生产");
            productNum--;
            obj.notifyAll();
        }

    }


}
