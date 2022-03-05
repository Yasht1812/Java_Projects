package com.thinkitive.day2.hibernate.annotations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.thinkitive.day1.hibernate.Employee;
import com.thinkitive.day2.hibernate.Address;

public class MyClass {
public List getEmployess() {
	//List l = null ; 
	//Address address = new Address(433019, "Pune");
	Configuration cfg = new Configuration();
	cfg.addAnnotatedClass(Address.class);
	SessionFactory factory = cfg.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	Criteria c = session.createCriteria(Employee.class);
	//c.add(Restrictions.lt("salary", 90000));
	//c.add(Restrictions.like("empid", 12));
	List l1 = session.createQuery("From Address").list();
	//l = c.list();
	System.out.println(l1);
	//session.save(address);
	t.commit();
	session.close();
	factory.close();
	//return l;
	return l1;
}
}
