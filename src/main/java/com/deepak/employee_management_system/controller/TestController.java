package com.deepak.employee_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/tesitin")
    public String sayHello() {
        return "Hello, World!";
    }
}

