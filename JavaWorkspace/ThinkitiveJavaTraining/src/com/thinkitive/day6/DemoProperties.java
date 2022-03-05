package com.thinkitive.day6;

import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;

public class DemoProperties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileReader fr = new FileReader("demo.txt");
		prop.load(fr);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("city"));
		System.out.println(prop.getProperty("mobile"));

	}

}
