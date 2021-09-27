package com.example.model;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student implements Serializable{
	String name;
	String schoolName;
	String RollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
}
