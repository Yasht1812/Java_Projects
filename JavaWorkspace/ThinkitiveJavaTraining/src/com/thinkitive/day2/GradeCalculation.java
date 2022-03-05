package com.thinkitive.day2;

public class GradeCalculation {

	public static void main(String[] args) {
		int a = 55 ; 
		if(a >= 70) {
			System.out.println("Distinction");
		}
		else if(a<70 && a>=60) {
			System.out.println("Second class");
		}
		else if(a<60 && a>=50 ) {
			System.out.println("Third Class");
		}
		else {
			System.out.println("Average");
		}

	}

}
