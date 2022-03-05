package com.thinkitive.day4;

public class EmployeeExecutable {

	public static void main(String[] args) {
		Employee e = new Employee(1,"ABC");
		Employee e2 = new Employee(2, "XYZ");
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e==e2);
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		

	}

}
