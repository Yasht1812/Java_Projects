package com.thinkitive.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee1Executable {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean5.xml"); 
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Employee1 employee1 = (Employee1)factory.getBean("studentbean");  //("employeebean2");
		Student student = (Student)factory.getBean("studentbean");
		student.allDetails();
	}

}
