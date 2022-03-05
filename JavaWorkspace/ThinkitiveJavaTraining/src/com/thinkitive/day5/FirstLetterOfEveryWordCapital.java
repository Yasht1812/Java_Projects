package com.thinkitive.day5;

public class FirstLetterOfEveryWordCapital {

	public static void main(String[] args) {
		String s = "hello world hi how are you";

		char[] ch = s.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		for (int i = 1; i < ch.length; i++) {
			if (ch[i - 1] == ' ') {
				ch[i] = Character.toUpperCase(ch[i]);
			}

		}
		System.out.println(new String(ch));

	}

}
