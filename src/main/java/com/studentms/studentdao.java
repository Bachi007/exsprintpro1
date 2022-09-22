package com.studentms;

import org.hibernate.Session;

public class studentdao {

	public void saveStudent(student s) {
		
		Session ses=HibernateUtil.getSession();
		
		ses.beginTransaction();
		ses.save(s);
		ses.getTransaction().commit();
	}
	
	public student retriveStudent(int stId) {
Session ses=HibernateUtil.getSession();
		
		ses.beginTransaction();
		student s1=ses.get(student.class, stId);
		ses.getTransaction().commit();
		return s1;
		
	}
	
}
