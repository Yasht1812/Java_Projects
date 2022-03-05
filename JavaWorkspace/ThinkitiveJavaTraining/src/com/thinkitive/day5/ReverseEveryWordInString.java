package com.thinkitive.day5;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String s = "hello world how are you";
		System.out.println("Before reverse: " + s);
		String revString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			revString = revString + s.charAt(i);
		}
		System.out.println("After Reverse: " + revString);
		String [] aStrings= revString.split(" ");
		for (int i = aStrings.length-1; i >= 0; i--) {
			System.out.print(aStrings[i]+" ");
		}

	}

}
