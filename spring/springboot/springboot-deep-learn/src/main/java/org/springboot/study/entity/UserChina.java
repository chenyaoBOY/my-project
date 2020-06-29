package org.springboot.study.entity;

/**
 * @author chenyao
 * @date 2020/6/28 17:51
 * @description
 */
public class UserChina extends UserParent {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "UserChina{" +
                "country='" + country + '\'' +
                '}';
    }
}
