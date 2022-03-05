package com.thinkitive.day7.db;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.thinkitive.day7.Employee;

public class GetDetails {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("com.thinkitive.day7.Employee");
			Method [] m = c.getDeclaredMethods();
			
			for (Method x : m) {
				System.out.println(x.getName());
			}
			
			Field [] f = c.getDeclaredFields();
			for (Field x : f) {
				System.out.println(x.getName());
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
