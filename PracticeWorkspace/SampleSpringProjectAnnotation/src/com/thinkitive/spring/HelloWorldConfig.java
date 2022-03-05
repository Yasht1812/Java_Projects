package com.thinkitive.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.thinkitive.spring.config.StudentConfig;


@Configuration
@Import(StudentConfig.class)
public class HelloWorldConfig {

	@Bean(initMethod = "init" , destroyMethod = "destroy")
	@Scope("prototype")
	public HelloWorld helloWorld() {
		return new HelloWorld(employee());
	}
	
	@Bean
	public Employee employee() {
		return new Employee();
	}

	

}
