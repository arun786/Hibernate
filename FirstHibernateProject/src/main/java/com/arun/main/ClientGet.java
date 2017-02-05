package com.arun.main;

import org.hibernate.Session;

import com.arun.entity.Employee;
import com.arun.util.Util;

public class ClientGet {

	public static void main(String[] args) {
		Session session = Util.getSession();
		session.beginTransaction();
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp);
		session.close();
	}

	/*
	 * o/p will be Hibernate:
	 * select employee0_.id as id1_0_0_, employee0_.name
	 * as name2_0_0_, employee0_.salary as salary3_0_0_ from Employee employee0_
	 * where employee0_.id=? Employee [id=1, name=Arun, salary=10000]
	 */

}
