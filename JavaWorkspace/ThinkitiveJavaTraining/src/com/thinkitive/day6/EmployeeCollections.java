package com.thinkitive.day6;



public class EmployeeCollections implements Comparable<EmployeeCollections> {
private String nameString;
private int empid;
private double salary;

public EmployeeCollections(String namString,int empid, double salary) {
	this.nameString = namString;
	this.empid= empid;
	this.salary=salary;
}

public String getNameString() {
	return nameString;
}

public void setNameString(String nameString) {
	this.nameString = nameString;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return " [nameString=" + nameString + ", empid=" + empid + ", salary=" + salary + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeCollections other = (EmployeeCollections) obj;
	if (empid != other.empid)
		return false;
	return true;
}

@Override
public int compareTo(EmployeeCollections e) {
	if(this.empid > e.empid) {
		return 1;
	}
	else if(this.empid < e.empid) {
		return -1;
	}
	else 
		return 0;
}

	
}
