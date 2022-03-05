package com.thinkitive.day4;

public class Employee2 {
	String ename;
	String lastName;

	public Employee2() {

	}

	public Employee2(String ename, String lastName) {
		this.ename = ename;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee2 [ename=" + ename + ", lastName=" + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Employee2 e = (Employee2) obj;
		if (this.ename == e.ename) {
			return true;
		} else {
			return false;
		}

	}

 
	public static void main(String[] args) {
		Employee2 e2 = new Employee2("ABC", "XYZ");
		Employee2 e3 = new Employee2("ABC", "XYZ");
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
