package org.study.project.zookeeper;

import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

public class ZookeeperManage {

    public static void main(String[] args) throws Exception {


        ZooKeeper zooKeeper = new ZooKeeper("10.102.36.163", 2000 * 10, null);

        Stat exists = zooKeeper.exists("/zookeeper", null);
        byte[] data = zooKeeper.getData("/zookeeper", false, new Stat());
        String s = new String(data);

        System.out.println(exists);
    }
}
