package com.thinkitive.day3;

public class Employee2 {

	String ename;
	double basicSalary;
	double HRA;
	double PF;
	static int PT=200;;
	double medicalAllowance;
	double grossSalary;
	double netSalary;
	
	int empid;

	public Employee2() {
		
	}
	public Employee2(int empid ,String ename,double basicSalary,double medicalAllowance) {
		this.empid = empid;
		this.ename = ename;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		calculateHra();
		calculatePf();
		grossSalary();
		netSalary();
	}

	void calculateHra() {
		this.HRA=this.basicSalary*0.5;
	}
	void calculatePf() {
		this.PF=(this.basicSalary*12)/100;
	}
	double grossSalary() {
		this.grossSalary=this.basicSalary+this.HRA+this.medicalAllowance;
		return this.grossSalary;
	}
	void netSalary() {
		this.netSalary=this.grossSalary-this.PF-PT;
	}
	void printData() {
		System.out.println("ID :" + empid);
		System.out.println("NAME :" + ename);
		System.out.println("BasicSalary :" + basicSalary);
		/*
		 * System.out.println("HRA :" + HRA); System.out.println("PF :" + PF);
		 * System.out.println("PT :" + PT); System.out.println("MedicalAllowance :" +
		 * medicalAllowance);
		 */
		System.out.println("GrossSalary :" + grossSalary);
		System.out.println("NetSalary :" + netSalary);
		
	}
}