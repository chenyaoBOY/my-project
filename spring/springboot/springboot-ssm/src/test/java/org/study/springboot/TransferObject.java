package org.study.springboot;

import org.study.ssm.domain.GprsReconciliationChannelBill;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author chenyao
 * @date 2020/6/17 11:05
 * @description
 */
public class TransferObject {

    public static<T> T transfer(T t) throws IllegalAccessException {
        Class<?> aClass = t.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object o = field.get(t);
            if(o!=null){
                continue;
            }
            String simpleName = field.getType().getSimpleName();
            if(simpleName.equals("String")){
                field.set(t,"");
            }else if(simpleName.equals("Integer")){
                field.set(t,0);
            }else if(simpleName.equals("Long")){
                field.set(t,0L);
            }else if(simpleName.equals("Date")){
                field.set(t,new Date());
            }else if(simpleName.equals("BigDecimal")){
                field.set(t,new BigDecimal("0"));
            }
        }
        return t;
    }

    public static void main(String[] args) throws IllegalAccessException {
        GprsReconciliationChannelBill bill = new GprsReconciliationChannelBill();
        TransferObject object = new TransferObject();
        GprsReconciliationChannelBill transfer = object.transfer(bill);
        System.out.println(transfer.getAmount());
    }
}
