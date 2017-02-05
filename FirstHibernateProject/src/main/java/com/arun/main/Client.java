package com.arun.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Employee;

public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Arun");
		emp.setSalary("10000");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
	}
}
