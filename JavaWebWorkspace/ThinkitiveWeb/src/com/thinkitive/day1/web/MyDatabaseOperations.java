package com.thinkitive.day1.web;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class MyDatabaseOperations {

	MyConnection db = new MyConnection();
	Statement st;
	PreparedStatement ps;

	public void insertEmp(String user, String name) {

		try {
			ps = db.getPreparedStatement("insert into think_emp values(?,?)");
			ps.setString(1, user);
			ps.setString(2, name);
			ps.execute();

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteEmp(String user) {

		try {
			ps = db.getPreparedStatement("delete from think_emp where id=?");
			ps.setString(1, user);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmp(String user, String name) {

		try {
			ps = db.getPreparedStatement("update think_emp set name=? where id=?");
			ps.setString(1, name);
			ps.setString(2, user);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List displayEmp() {
		List l = new ArrayList();
		st = db.getStatement();

		try {
			ResultSet rs = st.executeQuery("select * from think_emp");

			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
				l.add(rs.getString(1) + " " + rs.getString(2));
			}

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}
	

}
