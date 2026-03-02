package com.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.orderservice.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}