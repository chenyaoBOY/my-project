package com.study.jdk;

/**
 * @author chenyao
 * @date 2020/4/3 9:49
 * @description
 */
public class ValueTransfer {

    private   String msg;

    public ValueTransfer(String msg) {
        this.msg = msg;
    }

    public static void main(String[] args) {

        ValueTransfer v1 = new ValueTransfer("v1");
        ValueTransfer v2 = new ValueTransfer("v2");
        System.out.println(v1);
        System.out.println(v2);

        change(v1,v2);

        System.out.println(v1);
        System.out.println(v2);

    }

    public static void change(ValueTransfer v1,ValueTransfer v2){

        ValueTransfer temp =v2;
        v2=v1;
        v1=temp;

    }


    @Override
    public String toString() {
        return "ValueTransfer{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
