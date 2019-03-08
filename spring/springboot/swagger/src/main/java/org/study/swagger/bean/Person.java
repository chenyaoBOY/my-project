package org.study.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "人物")
public class Person implements Serializable {

    @ApiModelProperty(value = "人物id",required = true)
    private int id;
    @ApiModelProperty(value = "人物姓名",required = true)
    private String name;
    @ApiModelProperty(value = "人物地址",required = false)
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
