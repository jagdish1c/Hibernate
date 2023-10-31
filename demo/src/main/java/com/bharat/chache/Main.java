package com.bharat.chache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bharat.demo.Alien;

public class Main {
public static void main(String[] args) {


	  Configuration con = new Configuration().configure().addAnnotatedClass(Example.class);        
      SessionFactory sf = con.buildSessionFactory();
       Session session1= sf.openSession();
       Transaction tr = session1.beginTransaction();
	Example ex1=(Example)session1.get(Example.class, 1);
	System.out.println(ex1);
		 tr.commit();
		 
	       Session session2 = sf.openSession();
	       Transaction t = session2.beginTransaction();
	   	Example ex2=(Example)session1.get(Example.class, 2);
		System.out.println(ex2);
		t.commit();
			 
}
}
