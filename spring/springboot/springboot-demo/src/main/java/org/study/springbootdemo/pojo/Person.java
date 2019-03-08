package org.study.springbootdemo.pojo;

import java.util.Date;

/**
 * @author chenyao
 * @Description:
 * @date 2018/6/19/10:44
 */
public class Person {

    private String id;
    private String name;
    private String address;

    private Date birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
