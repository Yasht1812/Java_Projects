package com.thinkitive.day2.springdemp2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
private int empid; 
private String ename; 
private int salary;
@Autowired
private Address address;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int empid, String ename, int salary) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.salary = salary;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((ename == null) ? 0 : ename.hashCode());
	result = prime * result + salary;
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
	Employee other = (Employee) obj;
	if (empid != other.empid)
		return false;
	if (ename == null) {
		if (other.ename != null)
			return false;
	} else if (!ename.equals(other.ename))
		return false;
	if (salary != other.salary)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
}



}
