package com.example.model;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

public class ModelDemo {

	private String fName ;
	private String lName;
	private int phoneNo;
	
	
	public ModelDemo(String fName, String lName, int phoneNo) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "ModelDemo [fName=" + fName + ", lName=" + lName + ", phoneNo=" + phoneNo + "]";
	}
	
}
