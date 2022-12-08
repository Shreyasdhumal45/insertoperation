package com.cache2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Demo {
public static void main(String[] args) {
	
    Configuration cfg =new Configuration();
	cfg.configure ("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
    Student student=(Student) session.load(Student.class, 3);
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getCity());
	session.close(); 
	
	Session session1=sf.openSession();
	 Student student1=(Student) session1.load(Student.class, 3);
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getCity());
	
	tr.commit();
	session1.close();               	 	
	System.out.println("Insertion Success");
} 
}