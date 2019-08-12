package com.dubbo.consumer.controller;

import com.dubbo.common.bean.UserAddress;
import com.dubbo.common.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/initOrder/{id}")
    public ResponseEntity<List<UserAddress>> getUserAddressList(@PathVariable("id") String userId){
        return ResponseEntity.ok(orderService.initOrder(userId));
    }
}
