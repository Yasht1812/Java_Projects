package com.thinkitive.day1.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutable {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee e = context.getBean(Employee.class);
		e.hello();
		 Address a = context.getBean(Address.class);
		
		e.setSalary(78787);
		System.out.println(e);
		System.out.println(a);

	}

}
