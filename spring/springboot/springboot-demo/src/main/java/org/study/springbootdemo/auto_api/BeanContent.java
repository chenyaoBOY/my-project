package org.study.springbootdemo.auto_api;

public class BeanContent<K> {
    private String fieldName;
    private K filedType;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public K getFiledType() {
        return filedType;
    }

    public void setFiledType(K filedType) {
        this.filedType = filedType;
    }
}
