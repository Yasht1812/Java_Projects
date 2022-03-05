package com.thinkitive.spring2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserExecutable {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.displayAll();

	}

}
