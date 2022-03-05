package com.thinkitive.day5;

public class Reverse_A_String {

	public static void main(String[] args) {
		String s = "hello world";
		System.out.println("Before reverse: " + s);
		String revString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
		}
		System.out.println("After Reverse: " + revString);

	}

}
