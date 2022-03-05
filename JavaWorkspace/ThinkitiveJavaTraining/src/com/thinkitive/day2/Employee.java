package com.thinkitive.day2;

public class Employee {
//code and data 
// methods and fields
//FIELDS
	int empid;
	String ename;
	int salary;
	
//Constructor
	public Employee(int id , String name , int sal) { 
		empid = id;
		ename = name;
		salary = sal;
	}
	
	public void printData() {
		System.out.println("ID :" + empid);
		System.out.println("NAME :" + ename);
		System.out.println("SALARY :" + salary);
	}

}
