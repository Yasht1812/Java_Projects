package com.thinkitive.day5;

import com.thinkitive.day5.Outer.Inner;

public class OuterExecutable {

	public static void main(String[] args) {
	Outer o = new Outer();
	Inner i = o.new Inner();
	System.out.println(i);

	}

}
