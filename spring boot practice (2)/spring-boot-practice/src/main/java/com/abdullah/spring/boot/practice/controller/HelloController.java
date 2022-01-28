package com.abdullah.spring.boot.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "Welcome to Abdullah's Blog!!";
    }
}
