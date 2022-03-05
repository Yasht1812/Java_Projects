package com.thinkitive.day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoProperties3 {

	public static void main(String[] args) {
		
	try {
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("output.txt");
		String s="";
		while((s = br.readLine()) != null) {
			fw.write(s);
		}
		br.close();
		fw.close();
		System.out.println("File copied");
	} catch (IOException e) {
		e.printStackTrace();
	}	
			
	}
}
