package com.thinkitive.day7;

public class MyThread implements Runnable{
@Override
public void run() {
	for (int i = 0; i < 11; i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
