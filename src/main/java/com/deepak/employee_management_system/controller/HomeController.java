package com.deepak.employee_management_system.controller;
import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
	public String index() {
        System.out.println("Hello");
		// Create a File object for the current directory
        File currentDir = new File(".");
        
        // Get the absolute path of the current directory
        String currentDirectory = currentDir.getAbsolutePath();
        
        // Print the current directory
        System.out.println("Current directory: " + currentDirectory);
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
