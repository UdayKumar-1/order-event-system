package com.orderAnalyticsService.repository;

import com.orderAnalyticsService.entity.OrderAnalytics;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderAnalyticsRepository extends MongoRepository<OrderAnalytics, String> {
}
