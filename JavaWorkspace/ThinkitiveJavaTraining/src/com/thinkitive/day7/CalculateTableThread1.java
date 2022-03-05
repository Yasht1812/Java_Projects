package com.thinkitive.day7;

public class CalculateTableThread1 extends Thread{
	CalculateTable c;
	public CalculateTableThread1(CalculateTable c) {
		this.c = c;
	}
	@Override
	public void run() {
		
		c.calculateTable(8);
	}
}
