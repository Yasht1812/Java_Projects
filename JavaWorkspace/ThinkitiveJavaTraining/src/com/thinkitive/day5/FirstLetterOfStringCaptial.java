package com.thinkitive.day5;

public class FirstLetterOfStringCaptial {

	public static void main(String[] args) {
		String s = "hello world";
		String s1 = s.toUpperCase().substring(0, 1);
		String s2 = s.substring(1, s.length());
		String s3 = s1 + s2;
		System.out.println("After upper case :" + s3);
	}

}
