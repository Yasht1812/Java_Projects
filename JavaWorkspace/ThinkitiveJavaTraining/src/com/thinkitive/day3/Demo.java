package com.thinkitive.day3;

public class Demo {
	
	public static void main(String[] args) {
		Employee e = Employee.getEmployee();
		e.setEmpid(0);
		System.out.println(e.getEmpid());
		Employee e1 = Employee.getEmployee();
		e1.setEmpid(0);
		System.out.println(e1.getEmpid());
		Employee e2 = Employee.getEmployee();
		e2.setEmpid(0);
		System.out.println(e2.getEmpid());
	}
}
