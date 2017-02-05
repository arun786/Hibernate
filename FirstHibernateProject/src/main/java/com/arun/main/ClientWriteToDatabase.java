package com.arun.main;

import java.math.BigDecimal;

import org.hibernate.Session;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class ClientWriteToDatabase {
	
	public static void main(String[] args) {
		Session session = Util.getSession();
		session.beginTransaction();
		for (int i = 0; i < 10; i++) {
			
			Employee emp = new Employee();
			emp.setName("arun" +  i);
			emp.setSalary(new BigDecimal(1000*i));
			session.save(emp);
		}
		
		session.getTransaction().commit();
		
	}

}
