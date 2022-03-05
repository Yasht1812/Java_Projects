package com.thinkitive.day6;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<EmployeeCollections> {

	@Override
	public int compare(EmployeeCollections e1, EmployeeCollections e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if (e1.getSalary() < e2.getSalary()) {
			return -1;
		} else
			return 0;
	}

}
