package com.mgmt.orderdetails.services.impl;

import com.mgmt.orderdetails.dto.OrderDetailsResponse;
import com.mgmt.orderdetails.dto.OrderResponseDto;
import com.mgmt.orderdetails.dto.UserResponseDto;
import com.mgmt.orderdetails.services.OrderDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    RestTemplate template;

    @Override
    public OrderDetailsResponse findOrderDetailsOfUser(Long userId) {
        OrderDetailsResponse detailsResponse = null;

        String userServiceAddress = System.getenv().getOrDefault("SERVICE_USERS", "http://localhost:4000/users");
        String orderServiceAddress = System.getenv().getOrDefault("SERVICE_ORDERS", "http://localhost:5000/orders");

        ResponseEntity<UserResponseDto> userResponse = template.getForEntity(userServiceAddress + "/" + userId,
                UserResponseDto.class);
        if (userResponse.getStatusCode().equals(HttpStatus.OK)) {
            detailsResponse = new OrderDetailsResponse();
            detailsResponse.setUserDetails(userResponse.getBody());
            OrderResponseDto[] orderResponse = template
                    .getForEntity(orderServiceAddress + "/" + userId, OrderResponseDto[].class).getBody();
            detailsResponse.setOrderDetails(orderResponse);
        }
        return detailsResponse;
    }

}