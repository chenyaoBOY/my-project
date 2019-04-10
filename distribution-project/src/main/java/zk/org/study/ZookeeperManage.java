package zk.org.study;

import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class ZookeeperManage {

    public static void main(String[] args) throws Exception {


        ZooKeeper zooKeeper = new ZooKeeper("192.168.1.128:2181", 2000 * 10, null);
        System.out.println(zooKeeper.getState());
        Stat exists = zooKeeper.exists("/zookeeper", null);
        System.out.println(zooKeeper.getState());
        byte[] data = zooKeeper.getData("/zookeeper", false, new Stat());
        String s = new String(data);

        System.out.println(exists);
    }

    public static void tewst(ZooKeeper zk) throws InterruptedException {
        ZooKeeper.States state = zk.getState();
        boolean flag=true;
        while(flag){
            switch(state){
                case CONNECTED:
                    flag=false;
                    break;
                default:
                    System.out.println("zk正在连接中-----"+state);
                    Thread.sleep(1000);
                    break;
            }
        }
    }
}
