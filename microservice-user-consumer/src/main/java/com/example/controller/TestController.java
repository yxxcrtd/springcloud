package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${provider.url}")
    private String providerUrl;

    @GetMapping("{id}")
    public Object add(HttpServletRequest request, @PathVariable Long id) {
        System.out.println("============ 这是 Consumer 的输出 =================");
        return restTemplate.getForObject(providerUrl + id, Object.class);
    }

}   
