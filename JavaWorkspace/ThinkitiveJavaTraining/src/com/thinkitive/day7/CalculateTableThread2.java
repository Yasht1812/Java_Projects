package com.thinkitive.day7;

public class CalculateTableThread2 extends Thread{
	CalculateTable c;
	public CalculateTableThread2(CalculateTable c) {
		this.c = c;
	}
	@Override
	public void run() {
		
		c.calculateTable(9);
	}
}
