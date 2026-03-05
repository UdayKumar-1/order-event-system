package com.orderAnalyticsService.serviceImpl;

import com.orderAnalyticsService.entity.Order;
import com.orderAnalyticsService.entity.OrderAnalytics;
import com.orderAnalyticsService.repository.OrderAnalyticsRepository;
import com.orderAnalyticsService.service.OrderAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class OrderAnalyticsServiceImpl implements OrderAnalyticsService {

    @Autowired
    private OrderAnalyticsRepository orderAnalyticsRepository;

    @Override
    public void saveOrderAnalytics(Order order) {
        Optional<OrderAnalytics> optional =
                orderAnalyticsRepository.findById(order.getId());
        System.out.println("optional value "+optional);
        if (optional.isEmpty()) {
            OrderAnalytics orderAnaly = new OrderAnalytics();
            orderAnaly.setOrderId(order.getId());
            orderAnaly.setTotalClicks(1L);
            orderAnaly.setLastClickedAt(Instant.now());
            orderAnalyticsRepository.save(orderAnaly);
        } else {
            OrderAnalytics orderAnalytics = optional.get();
            orderAnalytics.setTotalClicks(orderAnalytics.getTotalClicks() + 1);
            orderAnalytics.setLastClickedAt(Instant.now());
            orderAnalyticsRepository.save(orderAnalytics);
        }
    }
}
