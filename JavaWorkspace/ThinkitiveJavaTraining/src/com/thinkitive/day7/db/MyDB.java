package com.thinkitive.day7.db;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import java.sql.Statement;


public class MyDB {

	public static void main(String[] args) {
		try {
			//Register Driver Class
			Class.forName("com.mysql.jdbc.Driver");
			
			//Create and establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
			
			//Statement
			Statement st = con.createStatement();
			
			//Execute Query
			//st.execute("create table think_emp(id int,name varchar(30))");
			st.execute("insert into think_emp values(5,'pqr')");
			ResultSet rs = st.executeQuery("select * from think_emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString("name"));
			}
			
			
			//Close Connection
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
