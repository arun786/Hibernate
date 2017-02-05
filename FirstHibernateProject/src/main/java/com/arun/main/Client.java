package com.arun.main;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class Client {

	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.setName("Arun");
		emp.setSalary(new BigDecimal("1000"));
		
		Session session = Util.getSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
	}
}
