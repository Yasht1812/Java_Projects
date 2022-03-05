package com.thinkitive.day7;

public class EmployeeExecutable {

	public static void main(String[] args) {

	
		Address a = new Address(123, "Mumbai");
		Employee e = new Employee(1, "abc", 1000, a);
		
		
		
		

		Employee temp = new Employee();

		e.doSerialize();
		System.out.println(e);
		
		
		
	

		temp = temp.doDeserialize();
		System.out.println(temp);
	}

}
