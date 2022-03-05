package com.thinkitive.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	int id; 
	String name; 
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	
//	public Employee(Student student) {
//		System.out.println("Inside Employee formal agrument constructor");
//		this.student=student;
//	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	
//	public void setStudent(Student student) {
//		this.student = student;
//	}
	
	
	
	public void displayAll() {
		System.out.println("The info of employee is");
		student.displayStudent();
	}
	

}
