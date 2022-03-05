package com.thinkitive.day2.springdemp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeExecutable {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.thinkitive.day2.springdemp2");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		Address address = context.getBean(Address.class);
		System.out.println(address);

	}

}
