package com.orderservice.serviceImpl;

import com.orderservice.entity.Order;
import com.orderservice.repository.OrderRepository;
import com.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Order createOrderService(Order order) {
        return orderRepository.save(order);
    }
}
