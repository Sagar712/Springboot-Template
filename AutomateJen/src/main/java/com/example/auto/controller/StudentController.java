package com.example.auto.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.auto.Services.StudentHandler;
import com.example.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentHandler studentHandler;
	
	/*
	 * @GetMapping("/Path") public String getPath() { File f = new File("./");
	 * return f.; }
	 */
	
	@CrossOrigin
	@GetMapping("/student")
	public List<Student> getALL(){
		try {
			return studentHandler.GetAllStudents();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
	
	@CrossOrigin
	@GetMapping("/student/{small}")
	public List<Student> getSearched(@PathVariable String small){
		try {
			return studentHandler.getByNameOrRoll(small);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@CrossOrigin
	@PostMapping("/student")
	public String addStudent(@RequestBody Student stu) throws ClassNotFoundException, IOException {
		return studentHandler.CreateStudent(stu);
	}
	
}
