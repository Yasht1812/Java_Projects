package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDBQueries {
	List<Employee> list = new ArrayList<Employee>();
public void insertEmployee(Employee e) {
	
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	list.add(e);
	session.save(e);
	t.commit();
	session.close();
	factory.close();
}
public Employee getEmployee(Integer empid) {
	
	Employee temp = null;
	for (Employee e : list) {
		if (e.getEmpid() == empid)
			temp = e;
	}
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	session.save(temp);
	t.commit();
	session.close();
	factory.close();
	return temp;
}
public void deleteEmployee(Employee e) {
	
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	session.delete(e);
	t.commit();
	session.close();
	factory.close();
}
public List<Employee> getAll() {
	
	Configuration cfg = new Configuration();
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	List l = session.createQuery("From Employee").list();
	System.out.println(l);
	t.commit();
	session.close();
	factory.close();
	return l;
}
}
