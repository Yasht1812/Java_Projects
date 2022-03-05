package com.thinkitive.day3;

public class ArrayExecutableEmployee2 {

	public static void main(String[] args) {
		Employee2 e2 = new Employee2(1,"Yash", 15000 , 600); 
		Manager manager = new Manager(2,"Thinkitive", 25000 , 600);
		MarketingExecutive marketingExecutive = new MarketingExecutive(3,"Thinkitive2", 45000 , 600,200);
		Employee2 arr [] = {e2,manager,marketingExecutive,new Employee2(),new Employee2(24, "ABC" , 1000, 400)};
		for(Employee2 temp:arr) {
			temp.printData();
		}
		
		

	}}



