package com.eurekaProvider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ServiceHandler {

    @RequestMapping("/service")
    public Map service(){
        Map<String,String> testResult = new HashMap<>();
        testResult.put("message sent back from Provider2"," hello world!");
        return testResult;
    }
}
