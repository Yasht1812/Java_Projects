package com.thinkitive.day7;

public class CalculateTableExecutable {

	public static void main(String[] args) {
		CalculateTable c = new CalculateTable();
		CalculateTableThread1 ct1 = new CalculateTableThread1(c);

		CalculateTableThread2 ct2 = new CalculateTableThread2(c);

		ct1.setName("Table 1");
		ct2.setName("Table 2");
		ct1.setPriority(9);
		ct1.start();
		ct2.start();

	}

}
