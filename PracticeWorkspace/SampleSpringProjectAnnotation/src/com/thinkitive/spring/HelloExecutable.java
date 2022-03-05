package com.thinkitive.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thinkitive.spring.config.Student;

public class HelloExecutable {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hello = context.getBean(HelloWorld.class);
		Student hello1 = context.getBean(Student.class);
		hello.setMessage("Hey Yash Hello");
		System.out.println(hello.getMessage());
		
	}

}
