package com.example.auto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

	@GetMapping("/home")
	public String home() {
		return "Welcome to app";
	}
}
