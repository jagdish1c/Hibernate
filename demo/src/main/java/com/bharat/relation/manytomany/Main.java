package com.bharat.relation.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(1);
		s.setName("Jagdish");
		
		
		Laptop l=new Laptop();
		l.setId(1);
		l.setName("Dell");
		l.getList().add(s);
		s.getList().add(l);
		
		Session session= (Session)new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class).buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(l);
		session.save(s);
		t.commit();
		
	}
}
