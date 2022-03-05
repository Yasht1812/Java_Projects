package com.thinkitive.day2.springdemp2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	@Scope(scopeName = "prototype")
	public Employee getEmployee() {
		return new Employee(1, "aaa", 10000);
	}
	
	@Bean
	@Scope(scopeName = "prototype")
	public Address getAddress() {
		return new Address(400001, "Pune");
	}
}
