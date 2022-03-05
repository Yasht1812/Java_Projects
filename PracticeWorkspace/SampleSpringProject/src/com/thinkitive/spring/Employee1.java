package com.thinkitive.spring;

public class Employee1 {
	public Employee1() {
		System.out.println("Inside Employee1 constructor");
	}
	
	int id ; 
	String name;
	Student student;
	public int getId() {
		return id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
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
	
	public void display() {
//		System.out.println("The name of employee is" + name);
//		System.out.println("The id of employee " + name + "is" +id);
		
		System.out.println("The id of employee" + id );
		// student.display();
	}
	
	public void getAllDetails() {
		System.out.println("Inside all details");
	}
//	public Employee1(int id, Student student) {
//		super();
//		this.id =id;
//		this.student = student;
//	}
	

}
