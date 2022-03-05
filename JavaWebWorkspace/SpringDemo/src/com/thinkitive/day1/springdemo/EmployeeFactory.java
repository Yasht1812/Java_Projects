package com.thinkitive.day1.springdemo;

public class EmployeeFactory {
	public Employee getInstance() {
		System.out.println("calling static method of another");
		return new Employee();
	}

}
