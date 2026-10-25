package com.learn.order_service.controller;

import com.learn.order_service.clients.ProductFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final ProductFeignClient productClient;

    public OrderController(ProductFeignClient productClient){
        this.productClient=productClient;
    }

    @GetMapping("/api/orders")
    public String getOrders() {
        return "Order Service is running!";
    }

    @GetMapping("/api/order/{id}")
    public Map<String,String> get(@PathVariable Long id){
        return productClient.getProduct(id);
    }
}
