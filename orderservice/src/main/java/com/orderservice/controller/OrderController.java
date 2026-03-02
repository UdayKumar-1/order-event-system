package com.orderservice.controller;

import com.orderservice.entity.Order;
import com.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;
    @PostMapping("/save_order")
    public void createOrder(@RequestBody Order order){
        Order orderRecord = orderService.createOrderService(order);
        System.out.println(orderRecord.toString()+" created ");
    }
}
