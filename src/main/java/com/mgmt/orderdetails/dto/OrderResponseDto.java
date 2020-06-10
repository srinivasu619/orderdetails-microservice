package com.mgmt.orderdetails.dto;

import java.util.Date;


public class OrderResponseDto {
    private Long orderId;
    private Integer orderAmount;
    private Date orderDate;

    public OrderResponseDto(){
    }

    /**
     * @return the orderId
     */
    public Long getOrderId() {
        return orderId;
    }
    /**
     * @return the orderAmount
     */
    public Integer getOrderAmount() {
        return orderAmount;
    }
    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }
}