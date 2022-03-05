package com.thinkitive.day2;

public class EmployeeThisKeyWord {
int empid;
String ename;
int salary; 

public EmployeeThisKeyWord() {
	
}
public EmployeeThisKeyWord(int empid, String ename) {
	this.empid = empid;
	this.ename = ename;
}
public EmployeeThisKeyWord(int empid,String ename,int salary) {
	this(empid,ename);
	this.salary=salary;
}
public void printData() {
	System.out.println("ID :" + empid);
	System.out.println("NAME :" + ename);
	System.out.println("SALARY :" + salary);
}
}
