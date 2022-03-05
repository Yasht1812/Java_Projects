package com.thinkitive.aop;

public class FactoryService {
	public Object getBean(String beanType) {
		if(beanType.equals("shape")) {
			return new Shape();
		}
		if(beanType.equals("circle")) {
			return new Circle();
		}
		return null;
	}

}
