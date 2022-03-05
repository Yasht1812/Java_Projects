package com.thinkitive.day8.db;

public class MyConnectionExecutable {
	public static void main(String[] args) {

		MyDatabaseOperations ops = new MyDatabaseOperations();

		ops.insertEmp(1, "ABC");
		ops.insertEmp(2, "PQR");
		ops.displayEmp();
		ops.deleteEmp(2);
	}
}
