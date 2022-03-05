package com.thinkitive.day1.hibernate.manytomany;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class EmployeeExecutable {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a1 = new Address(111, "Andheri");
		Address a2 = new Address(222, "Goregaon");
		Address a3 = new Address(333, "Borivali");

		Set<Address> l = new HashSet<Address>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		Employee e = new Employee(102, "Yash", 50000, l);
		session.save(e);
		t.commit();
		session.close();
		factory.close();

	}

}
