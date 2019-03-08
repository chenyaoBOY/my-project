package org.study.ssm.bean.date;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DateTO implements Serializable {

    private Date date;
    private String name;
    private BigDecimal number;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}
