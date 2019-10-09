package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignService {
    @Override
    public String test() {
        return "服务器正在维护。。。";
    }
}
