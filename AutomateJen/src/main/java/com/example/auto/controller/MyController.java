package com.example.auto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	@GetMapping("/create")
	public String page2() {
		return "page2.html";
	}
	
	@GetMapping("/studentWeb")
	public String StudentPage() {
		return "StudentHome.html";
	}
	
}
