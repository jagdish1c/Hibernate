package com.bharat.hibernatelifecycle;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
	public static void main(String[] args) {
		Laptop l=new Laptop(); //From creation of object to commit object ,object is in transient state.
		l.setId(1);
		l.setName("Jagdish");
		l.setPrice(50000);
		Session session= (Session)new Configuration().configure().addAnnotatedClass(Laptop.class).buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(l);
		l.setPrice(40000); //after object save we changed value but in database updated value goes.
		
//	     session.detach(l); //Entire object is detached with session.	
		t.commit();
	}
}
