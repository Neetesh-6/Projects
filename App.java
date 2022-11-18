package com.coursemanagementsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.coursemanagementsystem.*;


 public class App {
    public static void main(String[] args) 
{ 
    // Create Configuration
   Configuration configuration = new Configuration();
  configuration.configure("hibernate.cfg.xml");
  configuration.addAnnotatedClass(Course.class);
	 
 // Create Session Factory
SessionFactory sessionFactory = configuration.buildSessionFactory();
	 
  // Initialize Session Object
  Session session =  sessionFactory.openSession();
	 
	
	Course st1=new Course();
	Course st2= new Course();
	 
 
 
 
 
 st1.setId(1);
 st1.setCourseName("maths");
 st1.setDuration("1 year");
 
 st1.setAge(23);
 
 
 st2.setId(2);
 st2.setCourseName("English");
 st2.setDuration("2 Years");
 st2.setAge(24);
 
	 
session.beginTransaction();
	 
 // Here we have used
// save() method of JPA
session.save(st1);
session.save(st2);

	 
session.getTransaction().commit();
			
		}
}