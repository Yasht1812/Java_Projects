package com.thinkitive.day2;

public class CalculatorExecutable {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 2));
		System.out.println(c.divide(10, 2));
		System.out.println(c.multiply(10, 2));
		System.out.println(c.substract(10, 2));

	}

}
