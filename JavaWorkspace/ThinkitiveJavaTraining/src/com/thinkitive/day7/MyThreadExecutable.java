package com.thinkitive.day7;

public class MyThreadExecutable {

	public static void main(String[] args) {
		MyThread t = new MyThread(); //runnable target
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
		

	}

}
