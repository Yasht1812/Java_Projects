package com.thinkitive.day6;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyUsingMaps {

	public static void main(String[] args) {
		String s = "hello world how are you where is your cat your your cat";
		String aString [] = s.split(" ");
		Map<String, Integer> map = new HashMap<String , Integer>();
		for (String x : aString) {
			map.merge(x, 1, WordFrequencyUsingMaps::add);
		}
		System.out.println(map);
	}
	public static Integer add(Integer a , Integer b) {
		return a+b;
	}

}
