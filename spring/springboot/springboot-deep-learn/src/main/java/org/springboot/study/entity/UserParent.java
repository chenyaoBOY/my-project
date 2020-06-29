package org.springboot.study.entity;

/**
 * @author chenyao
 * @date 2020/6/28 17:51
 * @description
 */
public class UserParent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserParent{" +
                "name='" + name + '\'' +
                '}';
    }
}
