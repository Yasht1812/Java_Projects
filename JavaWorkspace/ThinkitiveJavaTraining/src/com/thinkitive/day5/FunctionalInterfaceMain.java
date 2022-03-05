package com.thinkitive.day5;

public class FunctionalInterfaceMain  {

	public static void main(String[] args) {
		MyInterface1 add = (a,b) -> a+b;
		MyInterface1 sub = (a,b) -> a-b;
		MyInterface1 mul = (a,b) -> a*b;
		MyInterface1 div = (a,b) -> a/b;
		
		System.out.println(add.performAction(10, 10));
		System.out.println(sub.performAction(10, 10));
		System.out.println(mul.performAction(10, 10));
		System.out.println(div.performAction(10, 10));
	}

	
}
