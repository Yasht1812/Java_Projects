package com.thinkitive.day1.hibernate;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDbConnection {
	public void insertEmployee() {
		Employee e = new Employee(19, "PQR", 9000);
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		
		
		/*
		 *  Query q = session.createQuery("From Employee where salary < 90000"); Query
		 * q1 = session.createQuery(s); q1.setParameter("empid", 19);
		 * q1.executeUpdate(); List l = q1.list(); System.out.println(l);
		 */

		
		session.delete(e);
	

		tx.commit();

		session.close();
		factory.close();

	}

}
