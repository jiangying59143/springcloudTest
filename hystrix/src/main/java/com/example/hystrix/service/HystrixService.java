package com.example.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="provider", fallback = HystrixError.class)
public interface HystrixService {

    @GetMapping("/provider/test")
    String test();
}
