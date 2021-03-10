package com.example.apilecture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String personalGreeting(@RequestParam( defaultValue = "World") String name) {

        return "Hello " + name;
    }

}