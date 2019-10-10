package com.example.hystrix.controller;

import com.example.hystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class FeignController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/test")
    public String test(){
        return hystrixService.test();
    }
}
