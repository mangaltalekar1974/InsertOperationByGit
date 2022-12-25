package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student student = new Student();
		student.setName("snehal");
		student.setCity("chaken");
		s.save(student);
	t.commit();
		s.close();
		System.out.println("inserted succesfully");

	}

}
