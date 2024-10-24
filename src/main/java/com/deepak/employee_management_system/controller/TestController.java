package com.deepak.employee_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/tesitin")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/home")
    public String home() {
        return "Sorry, For a Inconvience (Server at currently work on, please come back later). Contact to administrator (deepakagrawal9011@gmail.com)";
    }
}

