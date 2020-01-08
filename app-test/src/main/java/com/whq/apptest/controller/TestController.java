package com.whq.apptest.controller;

import com.whq.apptest.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    AppConfig appConfig;
    @GetMapping("hi")
    public String hi(String name){
        return "hi"+name;
    }
    @GetMapping("sleep")
    public String sleep() throws InterruptedException {
        Thread.sleep(5000l);
        return "hi";
    }
    @GetMapping("getConfig")
    public String getConfig(){
        return appConfig.getName();
    }
}
