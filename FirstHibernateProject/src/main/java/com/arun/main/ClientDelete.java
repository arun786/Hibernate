package com.arun.main;

import org.hibernate.Session;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class ClientDelete {
	public static void main(String[] args) {
		Session session = Util.getSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class, 2);
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
	}
}
