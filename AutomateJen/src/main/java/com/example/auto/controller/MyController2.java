package com.example.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auto.Services.CreateFile;
import com.example.model.ModelDemo;

@RestController
public class MyController2 {
	
	@Autowired
	CreateFile crFile;

	@CrossOrigin
	@GetMapping("/home")
	public String home() {
		return "Welcome to app";
	}
	
	@CrossOrigin
	@GetMapping("/info") 
	public ModelDemo info() {
		
		return new ModelDemo("Sagar","Wankhade",45);
		
	}
	
	@CrossOrigin
	@GetMapping("/createFile") 
	public String createFile() {
		String res = crFile.CreatingFile();
		return res;
		
	}
	
}
