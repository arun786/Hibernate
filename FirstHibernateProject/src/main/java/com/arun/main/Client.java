package com.arun.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Sachin");
		emp.setSalary("10000");
		
		Session session = Util.getSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
	}
}
