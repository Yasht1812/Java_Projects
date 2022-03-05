package com.thinkitive.day3;

public class MarketingExecutive extends Employee2 {
	double tourAllowance ; 
	double phoneAllowance;
	int kms_travelled;

public MarketingExecutive() {
	
}
public MarketingExecutive(int empid , String ename,double basicSalary,double medicalAllowance, int kms_travelled) {
	super(empid , ename, basicSalary, medicalAllowance);
	this.tourAllowance = kms_travelled;
	this.phoneAllowance = 1500;
}

public static void main(String[] args) {
	Employee2 e2 = new Employee2(1,"ABC", 15000 , 600); 
	e2.printData();
	Manager manager = new Manager(2,"PQR", 25000 , 700);
	manager.printData();
	MarketingExecutive marketingExecutive = new MarketingExecutive(3,"XYZ", 45000 , 600,200);
	marketingExecutive.printData();
}
}
