package com.bharat.embeddable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Address a=new Address();
		a.setCity("Xyz");
		a.setState("Xyz");
		
		Student s1=new Student();
		s1.setName("JXyz");
		s1.setRollnumber(1);
		s1.setAddress(a);
		
		Session s= (Session)new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		s.save(s1);
		t.commit();
	}
}
