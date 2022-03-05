package com.thinkitive.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class PrinterExecutable {

	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("bean7.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
		
		Atm printer = (Atm) context.getBean("atm");
		printer.printername("Canon");
		
		

	}

}
