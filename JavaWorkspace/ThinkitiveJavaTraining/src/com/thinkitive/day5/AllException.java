package com.thinkitive.day5;

public class AllException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0; 
		int [] c = {1,2,3,4};
		String s = null; 
		try {
			System.out.println (s.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		}
		try {
			System.out.println(c[19]=10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
