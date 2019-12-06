package org.study.project.jdk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author chenyao
 * @date 2019/10/8 15:54
 * @description
 */
public class StringTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String str = "asfg" + "asdfb";
        Class<?> clazz = Class.forName("java.lang.String");
        Object o = clazz.newInstance();
        String a = (String) o;
        System.out.println(a.length());
        Constructor<?>[] constructors = clazz.getConstructors();
        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
        }

    }
}
