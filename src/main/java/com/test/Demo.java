package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Demo {
public static void main(String[] args) {
	
    Configuration cfg =new Configuration();
	cfg.configure ("hibernate.cfg2.xml");
	SessionFactory sf=cfg.buildSessionFactory(); 
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	
    /* Student student=new Student();
   
	student.setCity("Pune");
	student.setName("Shreyas");
	session.save(student);	*/	
	
	Student student =(Student) session.get(Student.class, 1);
	//student.setName("Nikhil");
	  // session.update(student);	
	     session.delete(student);		
	
	
  /*  Query query=session.createQuery("from Student");
	List <Student> student=query.list();
	for (Student z:student) {
		System.out.println(z.getId());
		System.out.println(z.getName());
		System.out.println(z.getCity());
		
	}
*/	
	tr.commit();
	session.close();                          	 	
	System.out.println("Insertion Success");
} 
}