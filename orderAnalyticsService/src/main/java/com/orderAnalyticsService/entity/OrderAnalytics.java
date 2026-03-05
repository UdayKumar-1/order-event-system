package com.orderAnalyticsService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
@ToString
public class OrderAnalytics {
    @Id
    private String orderId;
    private Long totalClicks;
    private Instant lastClickedAt;
}
