package com.thinkitive.day2;

public class Employee2 {

	String ename;
	double basicSalary;
	double HRA;
	double PF;
	static int PT=200;;
	double medicalAllowance;
	double grossSalary;
	double netSalary;
	static int count = 101 ; 
	int empid;

	public Employee2(String ename,double basicSalary,double medicalAllowance) {
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		calculateHra();
		calculatePf();
		grossSalary();
		netSalary();
	}
	{this.empid = count++;}
	void calculateHra() {
		this.HRA=this.basicSalary*0.5;
	}
	void calculatePf() {
		this.PF=(this.basicSalary*12)/100;
	}
	void grossSalary() {
		this.grossSalary=this.basicSalary+this.HRA+this.medicalAllowance;
	}
	void netSalary() {
		this.netSalary=this.grossSalary-this.PF-PT;
	}
	void printData() {
		System.out.println("ID :" + empid);
		System.out.println("NAME :" + ename);
		System.out.println("BasicSalary :" + basicSalary);
		System.out.println("HRA :" + HRA);
		System.out.println("PF :" + PF);
		System.out.println("PT :" + PT);
		System.out.println("MedicalAllowance :" + medicalAllowance);
		System.out.println("GrossSalary :" + grossSalary);
		System.out.println("NetSalary :" + netSalary);
	}
	
	

}
