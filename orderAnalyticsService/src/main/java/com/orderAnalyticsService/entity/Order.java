package com.orderAnalyticsService.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @JsonProperty("id")
    private String id;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("price")
    private Long price;
    @JsonProperty("quantity")
    private Long quantity;
}
