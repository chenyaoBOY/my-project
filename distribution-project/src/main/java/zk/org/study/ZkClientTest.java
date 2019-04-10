package zk.org.study;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.junit.Test;

import java.io.Serializable;

/**
 * Author: chenyao
 * Date: 2019/4/9 16:45
 * Description: 验证zk上的节点数据发生变化时 是否能收到异步通知
 */
public class ZkClientTest {
    static ZkClient  zk = new ZkClient("192.168.1.128", 10000);
    public static void main(String[] args) {

        boolean exists = zk.exists("/zookeeper");
        System.out.println(exists);

        if(!zk.exists("/zk_test")){
            zk.createPersistent("/zk_test",new String[]{"1","2","3"});
        }
        zk.subscribeDataChanges("/zk_test", new IZkDataListener() {
            @Override
            public void handleDataChange(String dataPath, Object data) throws Exception {
                System.out.println(dataPath+" 路径已经被更改");
                System.out.println(data);
            }

            @Override
            public void handleDataDeleted(String dataPath) throws Exception {

                System.out.println(dataPath+" 路径被删除了");
            }
        });

        while (zk.exists("/zk_test")){

        }

    }

    @Test
    public void changeNode(){
        zk.writeData("/zk_test",1);
    }
    @Test
    public void deleteNode(){
        zk.delete("/zk_test");
    }


    class Cat implements Serializable {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
