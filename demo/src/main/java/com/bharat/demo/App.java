package com.bharat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args ){
		 Alien alien = new Alien();
		 alien.setAid(107);
		 alien.setAname("navin");
		 alien.setColor("Green");
		 
		 Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);       
		 SessionFactory sf = con.buildSessionFactory();
		 Session session = sf.openSession();
		 Transaction tr = session.beginTransaction();
		 session.save(alien);
		 tr.commit();
		 }
}
