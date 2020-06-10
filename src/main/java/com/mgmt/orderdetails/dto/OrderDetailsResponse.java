package com.mgmt.orderdetails.dto;


public class OrderDetailsResponse {
    private UserResponseDto userDetails;
    private OrderResponseDto[] orderDetails;

    /**
     * @return the userDetails
     */
    public UserResponseDto getUserDetails() {
        return userDetails;
    }

    /**
     * @param userDetails the userDetails to set
     */
    public void setUserDetails(UserResponseDto userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * @return the orderDetails
     */
    public OrderResponseDto[] getOrderDetails() {
        return orderDetails;
    }

    /**
     * @param orderDetails the orderDetails to set
     */
    public void setOrderDetails(OrderResponseDto[] orderDetails) {
        this.orderDetails = orderDetails;
    }
}