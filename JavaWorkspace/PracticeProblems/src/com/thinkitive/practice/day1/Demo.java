package com.thinkitive.practice.day1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import java.util.Iterator;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		hm.put(1, "Yash");
		hm.put(2, "Abhi");
		Set s1 = hm.entrySet();
		Iterator iterator = s1.iterator();
		while(iterator.hasNext()) {
			Map.Entry m1 = (Map.Entry) iterator.next();
			System.out.println(m1.getKey() + ".." + m1.getValue());
		}
	
}
}
