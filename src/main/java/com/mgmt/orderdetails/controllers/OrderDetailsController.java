package com.mgmt.orderdetails.controllers;

import com.mgmt.orderdetails.dto.OrderDetailsResponse;
import com.mgmt.orderdetails.services.OrderDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

    @Autowired
    OrderDetailsService orderDetailsService;

    @GetMapping("/{userId}")
    public ResponseEntity<OrderDetailsResponse> getOrderDetails(@PathVariable("userId") Long userId) {
        OrderDetailsResponse orderDetail = orderDetailsService.findOrderDetailsOfUser(userId);
        return new ResponseEntity<OrderDetailsResponse>(orderDetail, HttpStatus.OK);
    }
}