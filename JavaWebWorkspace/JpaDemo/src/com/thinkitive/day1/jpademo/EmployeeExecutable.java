package com.thinkitive.day1.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeExecutable {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myemp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		Employee e = new Employee(791, "Jacob", 88888);
		manager.persist(e);
		tx.commit();
		manager.close();
		factory.close();

	}

}
