package com.arun.main;

import org.hibernate.Session;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class ClientUpdate {
	public static void main(String[] args) {
		Session session = Util.getSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class, 1);
		emp.setName("Arun");
		session.update(emp);
		session.getTransaction().commit();
		session.close();
	}
}
