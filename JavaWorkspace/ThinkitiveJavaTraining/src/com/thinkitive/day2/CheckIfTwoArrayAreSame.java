package com.thinkitive.day2;

public class CheckIfTwoArrayAreSame {

	public static void main(String[] args) {
		int a [] = {34,4,2};
		int b [] = {2,4,34};
		int count = 0 ; 
		for(int x:a) {
			for(int y:b) {
				if(x==y) {
					count++;
					break;
				}
			}
		}
		if(count == a.length && count == b.length) {
			System.out.println("same");
		}
		else {
			System.out.println("Not same");
		}

	}

}
