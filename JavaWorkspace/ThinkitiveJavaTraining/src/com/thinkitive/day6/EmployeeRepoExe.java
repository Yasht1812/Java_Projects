package com.thinkitive.day6;

import java.util.*;

public class EmployeeRepoExe {

	public static void main(String[] args) {
		EmployeeRepository<EmployeeCollections2> m1 = new EmployeeRepository<EmployeeCollections2>();
		EmployeeCollections2 e1 = new EmployeeCollections2("ABC", 1, 10000);
		EmployeeCollections2 e2 = new EmployeeCollections2("PQR", 2, 20000);
		EmployeeCollections2 e3 = new EmployeeCollections2("XYZ", 3, 40000);
		EmployeeCollections2 e4 = new EmployeeCollections2("ABC", 1, 10000);
		m1.insertEmp(e1);
		m1.insertEmp(e2);
		m1.insertEmp(e3);
		System.out.println(m1.getAll());
		
		
		

	}

}
