package org.study.dubbo.consumer;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.RegistryFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.dubbo.service.UserService;

import java.io.IOException;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/17/17:52
 */
public class Consumer {

    public static void main(String[] args) throws IOException, InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"consumer.xml"});
        context.start();

//
//        RegistryFactory registryFactory = ExtensionLoader.getExtensionLoader(RegistryFactory.class).getAdaptiveExtension();
//        Registry registry = registryFactory.getRegistry(URL.valueOf("zookeeper://127.0.0.1:2181"));
//        registry.register(URL.valueOf(
//                "condition://0.0.0.0/org.study.dubbo.service.UserService?category=routers&dynamic=false&rule="
//                        + URL.encode(" host = 192.168.16.2 => ")));

        UserService service = (UserService) context.getBean("userService");


        while (true){

            String username = service.getUserName("username");
            System.out.println(username);

            Thread.sleep(2000);
        }

    }
}
