package com.sfbest.order.management.vo;

import java.io.Serializable;

public class GshopReturnsActiveGift implements Serializable {
    //
    private Integer id;

    //订单活动id
    private Integer orderActiveId;

    //订单赠品id
    private Integer orderProductId;

    //赠品个数
    private Integer orderProductNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderActiveId() {
        return orderActiveId;
    }

    public void setOrderActiveId(Integer orderActiveId) {
        this.orderActiveId = orderActiveId;
    }

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Integer getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(Integer orderProductNum) {
        this.orderProductNum = orderProductNum;
    }
}