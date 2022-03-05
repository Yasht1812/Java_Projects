package com.thinkitive.day5;

public class AssertionError {

	public static void main(String[] args) {
		int a = 10;
		int b = 0 ; 
		int c = 0;
		
		assert b>0:"denominator cannot be zero";
		
		c=a/b;
		System.out.println(c);

	}
	

}
