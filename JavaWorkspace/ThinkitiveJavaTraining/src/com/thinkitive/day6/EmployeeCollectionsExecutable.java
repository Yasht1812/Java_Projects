package com.thinkitive.day6;


import java.util.*;

public class EmployeeCollectionsExecutable {

	public static void main(String[] args) {
		
		EmployeeCollections e1 = new EmployeeCollections("ABC", 1, 1000);
		EmployeeCollections e2 = new EmployeeCollections("LMN", 1, 3000);
		EmployeeCollections e3 = new EmployeeCollections("XYZ", 2, 2000);
		EmployeeCollections e4 = new EmployeeCollections("PQR", 3, 4000);
		List<EmployeeCollections> l = new ArrayList<EmployeeCollections>();
		//Set<EmployeeCollections> l = new TreeSet<EmployeeCollections>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		//EmployeeSalaryComparator sal = new EmployeeSalaryComparator();
		EmployeeNameComparator name = new EmployeeNameComparator();
		Collections.sort(l,name);
		System.out.println(l);
		

	}

}
