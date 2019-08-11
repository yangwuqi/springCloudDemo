package com.eurekaConsumer1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/")
public class GetServiceHandler {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.app.name}")
    private String serviceName;

    @RequestMapping(value = "/service")
    public String testService(){
        String result = restTemplate.getForObject("http://"+serviceName
                +"/service", String.class);
        return result;
    }
}
