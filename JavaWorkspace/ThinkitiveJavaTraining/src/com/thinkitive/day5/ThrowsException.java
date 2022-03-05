package com.thinkitive.day5;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			hello();
		} catch (ClassNotFoundException e) {
			System.out.println("Check if classname is correct or not");
		}

	}
	public static void hello() throws ClassNotFoundException{
		Class.forName("com.thinkitive.day5.ThrowsException");
	}

}
