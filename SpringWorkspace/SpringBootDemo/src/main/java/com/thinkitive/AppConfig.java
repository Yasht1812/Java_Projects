package com.thinkitive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.thinkitive")
public class AppConfig {
	
@Bean
public Employee getEmployee() {
	return new Employee();
}
}
