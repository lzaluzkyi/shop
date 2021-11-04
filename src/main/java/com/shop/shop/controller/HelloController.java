package com.shop.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{userName}")
    public String hello(@PathVariable("userName") String name){
        return "Hello!! " + name;
    }



}
