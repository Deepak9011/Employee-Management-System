package com.deepak.employee_management_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
	public String index() {
        System.out.println("Hello");
		return "home";
	}

	@RequestMapping("/errorInThisPage")
	public String error() {
        System.out.println("Hello");
		return "error";
	}
	
	@GetMapping("/loginname")
	public String loginPage() {
		return "login";
	}
}
