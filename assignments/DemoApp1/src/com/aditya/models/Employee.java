package com.aditya.models;

import java.io.*;

public class Employee implements Serializable{
	private String firstName,LastName,designation;
	int age;
	public Employee(String firstName, String lastName, String designation, int age) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.designation = designation;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
