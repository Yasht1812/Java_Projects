package com.thinkitive.day1.hibernate.manytoOne;
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
		Address a = new Address(400001, "Dadar");

		Employee e = new Employee(69, "XYZW", 12345, a);
		
		session.save(e);
		t.commit();
		session.close();
		factory.close();

	}

}
