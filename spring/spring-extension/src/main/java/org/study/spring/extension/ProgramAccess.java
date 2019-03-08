package org.study.spring.extension;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyao
 * @Description:
 * @date 2018/7/18/15:25
 */
public class ProgramAccess {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"people.xml"});

        People people = (People)context.getBean("people");


        System.out.println(people);


    }
}
