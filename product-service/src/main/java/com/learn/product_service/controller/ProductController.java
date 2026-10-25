package com.learn.product_service.controller;

import com.learn.product_service.clients.OrderFiegnClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final OrderFiegnClient orderFiegnClient;

    public ProductController(OrderFiegnClient orderFiegnClient){
        this.orderFiegnClient=orderFiegnClient;
    }

    @GetMapping("/{id}")
    public Map<String, String> getProduct(
            @PathVariable Long id) {

        Map<String, String> product = new HashMap<>();
        product.put("id", String.valueOf(id));
        product.put("name", "Mechanical Keyboard");
        product.put("price", "2500");

        return product;
    }

    @GetMapping("/hello")
    public String getHello(){
        return orderFiegnClient.getOrder();
    }

}