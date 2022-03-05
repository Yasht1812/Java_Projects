package com.thinkitive.day1.web;

public class Factorial {
public int factorial(int num) {
	int fact=1;
	if (num==1) {
		return 1;
	}
	else {
		return num*factorial(num - 1);
		
	}
		
}
}
