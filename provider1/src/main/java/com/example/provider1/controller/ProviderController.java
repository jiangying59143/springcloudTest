package com.example.provider1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test(){
        return "test:" + port;
    }
}
