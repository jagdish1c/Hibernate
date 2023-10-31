package com.bharat.relation.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
	public static void main(String[] args) {
		PhoneNumber ph=new PhoneNumber();
		ph.setNumber(72144226);
		ph.setTelecomCompanyName("Jio");
		
		Person p=new Person();
		p.setName("Bharat");
		p.setPhonenumber(ph);
		
		Session s= (Session)new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(PhoneNumber.class).buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		s.save(ph);
		s.save(p);
		t.commit();
		
	}
}
