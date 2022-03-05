package com.thinkitive.day5;

public class WordFrequencyCount {

	public static void main(String[] args) {
		String s = "hello world how are you how is your cat";
		String[] aStrings = s.split(" ");
		for (int i = 0; i < aStrings.length; i++) {
			int count = 1;
			for (int j = i + 1; j < aStrings.length-1; j++) {
				if (aStrings[i].equals(aStrings[j])) {
					count++;
					aStrings[j] = "0";
				}
			}
			if (count >= 1 && aStrings[i] != "0") {
				System.out.println(aStrings[i] + " = " + count);
			}
		}

	}

}
