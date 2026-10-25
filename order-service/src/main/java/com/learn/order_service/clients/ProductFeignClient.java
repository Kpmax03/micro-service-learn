package com.learn.order_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "product-service")
public interface ProductFeignClient {

    @GetMapping("/api/products/{id}")
    Map<String,String> getProduct(@PathVariable Long id);

}
