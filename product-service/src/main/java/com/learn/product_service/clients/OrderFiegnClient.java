package com.learn.product_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order-service")
public interface OrderFiegnClient {

    @GetMapping("/api/orders")
    String getOrder();

}
