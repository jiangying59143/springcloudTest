package com.example.hystrix.service;

import org.springframework.stereotype.Component;

@Component
public class HystrixError implements HystrixService {
    @Override
    public String test() {
        return "服务器正在维护。。。";
    }
}
