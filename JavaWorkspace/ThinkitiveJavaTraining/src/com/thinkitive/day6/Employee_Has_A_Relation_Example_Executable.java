package com.thinkitive.day6;
import java.util.*;
public class Employee_Has_A_Relation_Example_Executable {
public static void main(String[] args) {
	EmployeeAddress a1 = new EmployeeAddress(411028, "Pune");
	EmployeeAddress a2 = new EmployeeAddress(400002, "Mumbai");

	Employee_Has_A_Relation_Example e1 = new Employee_Has_A_Relation_Example(18, "ABCD", 99, a1);
	Employee_Has_A_Relation_Example e2 = new Employee_Has_A_Relation_Example(23, "XYZ", 89, a2);

	Employee_Has_A_Relation_Example e3 = new Employee_Has_A_Relation_Example(13, "MNO", 66, a2);
	Employee_Has_A_Relation_Example e4 = new Employee_Has_A_Relation_Example(18, "ABC", 11, a1);

	List<Employee_Has_A_Relation_Example> list = new LinkedList<Employee_Has_A_Relation_Example>();
	// Set<Employee> list = new TreeSet<Employee>();

	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);

	EmployeeSalaryComparator sal = new EmployeeSalaryComparator();
	//EmpNameComparator name = new EmpNameComparator();
	Collections.sort(list);

	ListIterator<Employee_Has_A_Relation_Example> empitr = list.listIterator();

	// next().hasNext(),remove()
	while (empitr.hasNext()) {
		System.out.println(empitr.next());
	}

	System.out.println("IN REVERSE");

	while (empitr.hasPrevious()) {
		System.out.println(empitr.previous());
	}
}
}
