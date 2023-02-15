package com.lucky.bookkeeping.controller;

import com.lucky.bookkeeping.model.service.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Hello {

//    @GetMapping("v1/greeting(name)")
//    public String sayHello(@RequestParam("name") String name){
//        return  String.format("hello",name);
//    }

//    原子计数器
    private AtomicLong counter = new AtomicLong();

    @GetMapping("v1/greeting(name)")
    public Greeting sayHello(@RequestParam("name") String name){
        return  new Greeting(counter.incrementAndGet(), String.format("hello %s",name));
    }
}
