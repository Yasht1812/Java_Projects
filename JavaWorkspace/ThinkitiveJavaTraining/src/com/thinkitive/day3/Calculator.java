package com.thinkitive.day3;

public class Calculator {
	public Calculator() {
		System.out.println("Inside calculator constructor");
	}

	/**
	 * This method adds two int values and gives the output as the addition of them
	 * 
	 * @param a is the first input
	 * @param b is the second input
	 * @return addition of both a and b
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * This method multiplies two int values and gives the output as the addition of
	 * them
	 * 
	 * @param a is the first input
	 * @param b is the second input
	 * @return multiplication of both a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}
}
