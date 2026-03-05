package com.orderservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.orderservice.entity.Order;
import com.orderservice.kafka.OrderProducer;
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
    private OrderProducer orderProducer;
    @Autowired
    private OrderService orderService;
    @PostMapping("/save_order")
    public void createOrder(@RequestBody Order order) throws JsonProcessingException {
        Order orderRecord = orderService.createOrderService(order);
        orderProducer.sendOrder(orderRecord);
        System.out.println(orderRecord.toString()+" created ");
    }
}
