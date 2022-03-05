package com.thinkitive.aop;


//import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Executable {
public static void main(String[] args) {
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
	Shape shape = (Shape) context.getBean("shape");
	
	
//	  AspectJProxyFactory proxyFactory = new AspectJProxyFactory(shape);
//	  proxyFactory.addAspect(LoggingAspect.class);
//	  Shape proxyShape = proxyFactory.getProxy();
//	  //joinpoint
//	  proxyShape.getCircle();
	
	System.out.println(shape.getCircle().getName());
	//joinpoint
	shape.getCircle().getName();
}
}
	