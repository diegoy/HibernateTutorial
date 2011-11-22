package com.blogspot.runnerdtalks.hibernatetutorial.main;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.blogspot.runnerdtalks.hibernatetutorial.entity.User;

public class CreateNewUser {
	
	
	public static void main(String[] args) {
		AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
		annotationConfiguration.configure();
		
		SessionFactory sessionFactory = annotationConfiguration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		User user = new User();
		user.setName("root2");
		user.setPassword("raquel");
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		
		
		
		session.close();
		sessionFactory.close();
	}
}
