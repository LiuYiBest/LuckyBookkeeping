package com.lucky.bookkeeping.controllers;

import com.lucky.bookkeeping.model.Greeting;
import org.springframework.web.bind.annotation.*;

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
