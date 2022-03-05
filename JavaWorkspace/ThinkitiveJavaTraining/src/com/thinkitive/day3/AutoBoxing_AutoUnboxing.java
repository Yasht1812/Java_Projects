package com.thinkitive.day3;

public class AutoBoxing_AutoUnboxing {

	public static void main(String[] args) {
		int a = 4;
		Integer x = 66;
		String s = "123";
		int m = Integer.parseInt(s);
		System.out.println(m);
		Integer y = new Integer(a);
		a = x.intValue();
		System.out.println(a);
		System.out.println(y);

	}

}
