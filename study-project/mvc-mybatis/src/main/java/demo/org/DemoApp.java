package demo.org;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chenyao
 * @date 2019/6/13 17:20
 * @description
 */
public class DemoApp {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath*:applicationContext-demo.xml");
//        XmlBeanFactory app = new XmlBeanFactory(new ClassPathResource("applicationContext-demo.xml"));

        Demo bean = (Demo) app.getBean("demo");

        System.out.println(bean.getName());
    }
}


