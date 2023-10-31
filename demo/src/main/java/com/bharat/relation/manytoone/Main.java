package com.bharat.relation.manytoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Subject sub=new Subject();
		sub.setSubjectid(1);
		sub.setSubjectname("Java");
	

		
		
		Student s1=new Student();
		s1.setRollno(1);
		s1.setName("Jagdish");
		s1.getList().add(sub);
		sub.setStudent(s1);
		Session session= (Session)new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Subject.class).buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(s1);
		session.save(sub);
		t.commit();
	}
}
