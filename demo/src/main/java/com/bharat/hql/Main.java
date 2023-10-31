package com.bharat.hql;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	public static void main(String[] args) {
		
		Session session= (Session)new Configuration().configure().addAnnotatedClass(Students.class).buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		Random r=new Random();
		Query q=session.createQuery("from Students");
//		Query q=session.createQuery("from Students where marks >=50");
		List<Students>students=q.list();
		for(Students s:students) {
			System.out.println(s);
		}
		t.commit();
	}
}
