package com.thinkitive.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Executable {
	public static void main(String[] args) {
//	Resource resource = new ClassPathResource ("bean5.xml");   //("bean.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
		
		
		Student student = (Student) context.getBean("studentbean");
		System.out.println(student.getName());
		context.registerShutdownHook();
		
//		Student student2 = (Student) beanFactory.getBean("studentbean");
//		System.out.println(student2.getName());
		
	}

}

