package com.thinkitive.day6;

public class PracticeStackEmployeeCollections {

	public static void main(String[] args) {
		EmployeeStack<Integer> m = new EmployeeStack<Integer>();
		m.push(19);
		m.push(88);
		m.push(1);
		m.push(10);
		m.printStack();
		EmployeeStack<EmployeeCollections2> m1 = new EmployeeStack<EmployeeCollections2>();
		EmployeeCollections2 e1 = new EmployeeCollections2("ABC", 1, 10000);
		EmployeeCollections2 e2 = new EmployeeCollections2("PQR", 2, 20000);
		EmployeeCollections2 e3 = new EmployeeCollections2("XYZ", 3, 40000);
		EmployeeCollections2 e4 = new EmployeeCollections2("ABC", 1, 10000);
		m1.push(e1);
		m1.push(e2);
		m1.push(e3);
		m1.printStack();
	}

}
