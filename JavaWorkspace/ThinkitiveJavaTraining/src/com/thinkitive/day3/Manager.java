package com.thinkitive.day3;

public class Manager extends Employee2 {
	double foodAllowance;
	double managerAllowance;
	double otherAllowance;
public Manager(int empid, String ename,double basicSalary,double medicalAllowance) {
	super(empid,ename, basicSalary, medicalAllowance);
	this.foodAllowance = 0.08 * this.basicSalary;
	this.managerAllowance = 0.03*this.basicSalary;
	this.otherAllowance = 0.10*this.basicSalary;
}
	public Manager() {
		
	}
	@Override
	public double grossSalary() {
		this.grossSalary = super.grossSalary()+this.foodAllowance+this.managerAllowance+this.otherAllowance;
		return this.grossSalary;
		
	}
	
}
