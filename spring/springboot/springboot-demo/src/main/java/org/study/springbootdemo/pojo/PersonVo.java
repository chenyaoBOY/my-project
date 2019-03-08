package org.study.springbootdemo.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author chenyao
 * @Description:
 * @date 2018/6/19/10:44
 */
public class PersonVo {

    private Person person;

    private Date createTime;

    private List<Person> personList;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
