package org.study.dubbo.provider;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/17/17:46
 */
public class UserProvider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"provider.xml"});
        context.start();


//        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
//        Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://127.0.0.1:2181"));
//        registry.register(URL.valueOf(
//                "condition://0.0.0.0/org.study.dubbo.service.UserService?name=路由规则1&category=routers&dynamic=false&runtime=true&rule="
//                        + URL.encode("192.168.16.2 => 192.168.1.1 ")));

        System.in.read();

    }
}
