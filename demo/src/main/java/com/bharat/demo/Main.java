package com.bharat.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
        // How to fetch data from MySQL using hibernate.
		
		  Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);        
	       SessionFactory sf = con.buildSessionFactory();
	        Session session = sf.openSession();
	        
	        Alien a=new Alien();
	        Alien alean=(Alien)session.get(Alien.class,107);
	        System.out.println(alean);
	}
	
}
