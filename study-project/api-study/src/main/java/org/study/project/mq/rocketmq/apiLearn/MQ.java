package org.study.project.mq.rocketmq.apiLearn;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.junit.jupiter.api.Test;
import util.JsonUtil;

public class MQ {
    String topic = "SendOrderConfirm";
    String addr = "192.168.1.128:9876;192.168.1.129:9876";

    @Test
    public void producer() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {

        DefaultMQProducer producer = new DefaultMQProducer("producer1-group-order");
        producer.setInstanceName("demo1-instance-producer");
        producer.setNamesrvAddr(addr);
        producer.start();
        String body = "订单确认消息!";
        for (int i = 0; i < 5; i++) {
            Message message = new Message(topic, "OrderTag", (body + i).getBytes());
            SendResult result = producer.send(message);
            System.out.println(JsonUtil.objectToJson(result));
        }
        producer.shutdown();
    }

    @Test
    public void consumer() throws MQClientException, InterruptedException {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("consumer1-group-order");
        consumer.setNamesrvAddr(addr);
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);//消费策略
        consumer.subscribe(topic, "OrderTag");

        consumer.registerMessageListener((MessageListenerConcurrently) (list, consumeConcurrentlyContext) -> {
            try {
                for (MessageExt messageExt : list) {
                    if (messageExt.getReconsumeTimes() >= 2) {
                        //重试次数已达上限 记录日志或者其他操作
                        System.out.println("重试次数已达上限 记录日志或者其他操作");
                        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                    }
                    String body = new String(messageExt.getBody());
                    if(body.equals("订单确认消息!3")){
                        int i= 1/0;
                    }
                    System.out.println(Thread.currentThread().getName() + " consumerMessage=" + list.toString());
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            } catch (Exception e) {
                e.printStackTrace();
                //异常 消息重试 或者睡眠
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        });

        consumer.start();
        System.out.println("consumer已经启动！");
        while (true) {
            Thread.sleep(10000);
        }
    }

}
