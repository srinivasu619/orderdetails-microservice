package com.mgmt.orderdetails.services;

import com.mgmt.orderdetails.dto.OrderDetailsResponse;

public interface OrderDetailsService {

    public OrderDetailsResponse findOrderDetailsOfUser(Long userId);
}