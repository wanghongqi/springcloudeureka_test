package com.whq.apptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppTestApplication.class, args);
    }

}
