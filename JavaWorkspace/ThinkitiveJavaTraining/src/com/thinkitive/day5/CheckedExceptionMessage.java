package com.thinkitive.day5;

public class CheckedExceptionMessage {

	public static void main(String[] args) {
		//error();

	}
	public static void error() throws Exception {
		Class.forName("com.thinkitive.day5.InsufficientFunds");
	}

}
