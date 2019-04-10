package zk.org.study;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

/**
 * Author: chenyao
 * Date: 2019/4/9 16:31
 * Description:
 */
public class Zk {
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        ZooKeeper zooKeeper = new ZooKeeper("192.168.1.128", 10000, null);
        Stat exists = zooKeeper.exists("/zookeeper", null);
        System.out.println(exists);
    }
}
