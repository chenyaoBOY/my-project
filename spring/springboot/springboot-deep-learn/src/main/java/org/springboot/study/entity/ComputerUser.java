package org.springboot.study.entity;

/**
 * @author chenyao
 * @date 2020/7/14 17:44
 * @description
 */
public class ComputerUser {

    private String master;
    private Integer width;
    private Integer height;

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
