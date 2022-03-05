package com.thinkitive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
	Employee employee = context.getBean(Employee.class);
	employee.hello();
	System.out.println("hello world");
	}

}
