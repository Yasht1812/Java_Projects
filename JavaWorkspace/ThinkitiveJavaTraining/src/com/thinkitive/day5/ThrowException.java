package com.thinkitive.day5;

public class ThrowException {

	public static void main(String[] args) {
		hello();

	}
	public static void hello() {
		int age = 12;
		if(age>18 && age<35) {
			System.out.println("Admission Success");
		}
		else {
			InvalidAgeException i = new InvalidAgeException();
			throw i;
		}
	}

}
