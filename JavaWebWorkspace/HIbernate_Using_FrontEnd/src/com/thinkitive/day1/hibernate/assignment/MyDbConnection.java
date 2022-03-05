package com.thinkitive.day1.hibernate.assignment;



import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MyDbConnection {
	public void insertEmployee(Employee emp) {
		
		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession(); // CONNECTION OPEN

		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();

		session.close();
		factory.close();

	}
public List displayEmployee() {
	Configuration cfg = new Configuration();

	SessionFactory factory = cfg.configure().buildSessionFactory();

	Session session = factory.openSession(); // CONNECTION OPEN

	Transaction tx = session.beginTransaction();
	List l = session.createQuery("From Employee").list();
	tx.commit();

	session.close();
	factory.close();
	return l;
}
}
