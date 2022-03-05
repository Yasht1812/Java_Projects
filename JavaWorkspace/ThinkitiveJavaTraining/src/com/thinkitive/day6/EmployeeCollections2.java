package com.thinkitive.day6;

public class EmployeeCollections2 {

	private String nameString;
	private int empid;
	private double salary;

	public EmployeeCollections2(String namString, int empid, double salary) {
		this.nameString = namString;
		this.empid = empid;
		this.salary = salary;
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

}
