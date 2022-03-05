package com.thinkitive.day6;

public class Employee_Has_A_Relation_Example implements Comparable<Employee_Has_A_Relation_Example>{
private int empid;
private String nameString ; 
private double salary; 
private EmployeeAddress address;


public Employee_Has_A_Relation_Example() {
	
}
public Employee_Has_A_Relation_Example(int empid , String nameString,double salary) {
	this.empid = empid;
	this.nameString = nameString;
	this.salary = salary;
}

public Employee_Has_A_Relation_Example(int empid , String nameString,double salary, EmployeeAddress address) {
	this.empid = empid;
	this.nameString = nameString;
	this.salary = salary;
	this.address = address;
}


public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getNameString() {
	return nameString;
}
public void setNameString(String nameString) {
	this.nameString = nameString;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public EmployeeAddress getAddress() {
	return address;
}
public void setAddress(EmployeeAddress address) {
	this.address = address;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + empid;
	result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Employee_Has_A_Relation_Example other = (Employee_Has_A_Relation_Example) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (empid != other.empid)
		return false;
	if (nameString == null) {
		if (other.nameString != null)
			return false;
	} else if (!nameString.equals(other.nameString))
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee_Has_A_Relation_Example [empid=" + empid + ", nameString=" + nameString + ", salary=" + salary
			+ ", address=" + address + "]";
}
@Override
public int compareTo(Employee_Has_A_Relation_Example e) {

	if (this.empid > e.empid) {
		return 1;
	} else if (this.empid < e.empid)
		return -1;
	else
		return 0;
}



}
