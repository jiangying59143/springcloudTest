package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="provider", fallback = FeignError.class)
public interface FeignService {

    @GetMapping("/provider/test")
    String test();
}
