package com.thinkitive.day7;

public class CalculateTable {
public synchronized void calculateTable(int number) {
	for (int i = 1; i < 11; i++) {
		int result = number * i ; 
		System.out.println(number + " * " + i + " = " + result);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}

