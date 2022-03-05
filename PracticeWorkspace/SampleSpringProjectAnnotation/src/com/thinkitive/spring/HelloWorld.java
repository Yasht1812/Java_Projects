package com.thinkitive.spring;

public class HelloWorld {
	
	String message;

	public HelloWorld(Employee employee) {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("initializing bean");
	}
	public void destroy() {
		System.out.println("destroying bean");
	}
	
	

}
