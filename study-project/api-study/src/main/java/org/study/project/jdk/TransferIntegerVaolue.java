package org.study.project.jdk;

import java.lang.reflect.Field;

/**
 * @author chenyao
 * @date 2019/8/6 17:23
 * @description
 */
public class TransferIntegerVaolue {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a = 1;
        Integer b = 2;
        System.out.println("交换前 a=" + a + " b=" + b);
        swap(a, b);
        System.out.println("交换后 a=" + a + " b=" + b);
    }

    public static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        int temp= a.intValue();
        field.set(a,b);
        field.set(b,new Integer(temp));
    }
}
