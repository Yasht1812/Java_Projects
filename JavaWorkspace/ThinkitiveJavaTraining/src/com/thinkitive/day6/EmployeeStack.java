package com.thinkitive.day6;


import java.util.*;

public class EmployeeStack<T> {
List<T> l = new ArrayList<T>();
public void push(T data) {
	l.add(data);
}
public T pop() {
	T data = (T)l.remove(l.size()-1) ;
			return data;
}
public void printStack() {
	System.out.println(l);
}
}
