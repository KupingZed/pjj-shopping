package com.iotek.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by xiaohuang on 2017/11/10.
 */
public class OrderList implements Serializable {
    public static final String ORDERSTATE_NORMAL = "normal";
    public static final String ORDERSTATE_NOT_NORMAL = " not_normal";
    public static final Integer ORDERLIST_PAY = 1;
    public static final Integer ORDERLIST_NOT_PAY = 0;

    private Long id;
    private Long customerId;
    private BigDecimal totalMoney;
    private Timestamp orderCreateTime;
    private String orderState;
    private Integer isPay;
    //    一个订单对应一个用户
    private  Customer  customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Timestamp getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Timestamp orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }



    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalMoney=" + totalMoney +
                ", orderCreateTime=" + orderCreateTime +
                ", orderState='" + orderState + '\'' +
                ", isPay=" + isPay +
                ", customer=" + customer +
                '}';
    }
}
