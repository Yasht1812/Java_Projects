package com.thinkitive.spring;

public class Student {
	public Student() {
		// TODO Auto-generated constructor stub
	}

	String name;
	private Employee1 employee1;
//private Employee1 employee2;

//public Employee1 getEmployee2() {
//	return employee2;
//}
//
//public void setEmployee2(Employee1 employee2) {
//	this.employee2 = employee2;
//}

	public String getName() {
		return name;
	}

	public Employee1 getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

	public void allDetails() {
		employee1.getAllDetails();

	}

}
