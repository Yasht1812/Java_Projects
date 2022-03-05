package com.thinkitive.day3;

public class Employee {
private int empid;
private String ename;
private int salary;
static Employee e;

private Employee() {
	
}
public static Employee getEmployee() {
	if(e==null) {
		e=new Employee();
		return e;
	}
	else {
		System.out.println("object exists");
		return e;
	}
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
} 

void printData() {
	System.out.println("ID :" + this.empid);
	System.out.println("Ename :" + this.ename);
	System.out.println("Salary :"+ this.salary);
}


	

}
