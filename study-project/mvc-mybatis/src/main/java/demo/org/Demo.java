package demo.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyao
 * @date 2019/6/13 17:17
 * @description
 */
public class Demo {
    private String name = "Demo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
