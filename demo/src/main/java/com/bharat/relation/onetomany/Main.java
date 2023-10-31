package com.bharat.relation.onetomany; 

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
import com.bharat.relation.onetomany.Phonenumber;
import com.bharat.relation.onetomany.Person;
 
public class Main {
	public static void main(String[] args) {
		Phonenumber ph1=new Phonenumber();
		ph1.setNumber(702144226);
		ph1.setTelecomCompanyName("Jio");
		Phonenumber ph2=new Phonenumber();
		ph2.setNumber(7021);
		ph2.setTelecomCompanyName("Jio");

		Person p = new Person();
		p.setName("Jagdish");
		p.getPhonenumber().add( ph1);
		p.getPhonenumber().add(ph2);

		
		Session s= (Session)new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Phonenumber.class).buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		s.save(ph1);
    	s.save(ph2);
		s.save(p);
		t.commit();
		
	}
}
