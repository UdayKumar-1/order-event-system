package com.orderAnalyticsService.consumer;

import com.orderAnalyticsService.entity.Order;
import com.orderAnalyticsService.service.OrderAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderAnalyticsConsumer {

    @Autowired
    private OrderAnalyticsService orderAnalyticsService;

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void consume(Order order) {
        System.out.println("consumed order "+order.toString());
        orderAnalyticsService.saveOrderAnalytics(order);
    }
}