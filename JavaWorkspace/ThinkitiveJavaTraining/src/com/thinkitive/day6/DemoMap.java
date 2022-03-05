package com.thinkitive.day6;

import java.util.Map;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
	Map<Integer, String> map = new TreeMap<Integer , String>();
	map.put(56, "abc");
	map.put(73, "xyz");
	map.put(78, "mno");
	map.putIfAbsent(56, "abc");
	map.putIfAbsent(56, "abc");
	System.out.println(map);
	
	}

}
