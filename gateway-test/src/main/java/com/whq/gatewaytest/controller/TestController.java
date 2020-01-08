package com.whq.gatewaytest.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("gateway/test")
public class TestController {
    @GetMapping("empty")
    public Mono<String> empty(){
        return Mono.just("ok");
    }

    @GetMapping("sleep50")
    public Mono<String> sleep50() throws InterruptedException {
        Thread.sleep(5000l);
        return Mono.just("ok");
    }

    @PostMapping("post")
    public Mono<String> post(@RequestBody Map map) throws InterruptedException {
        Thread.sleep(50l);
        return Mono.just("ok");
    }
}
