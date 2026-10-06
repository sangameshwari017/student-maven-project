package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.module.student;

public class program1 implements studentDAO{

		
		@Override
		public boolean addStudent(student s) {
			Configuration config1 = new Configuration();

			Configuration config2 = config1.configure();

			Configuration config3 = config2.addAnnotatedClass(student.class);


		    SessionFactory sessionfactory = config3.buildSessionFactory();
		    Session session = sessionfactory.openSession();
		    Transaction transaction = session.beginTransaction();

		    session.save(s);

		    transaction.commit();
		    session.close();

		    return true;
		}
	

		@Override
		public student getStudent(int id) {

			Configuration config1 = new Configuration();

			Configuration config2 = config1.configure();

			Configuration config3 = config2.addAnnotatedClass(student.class);

		    SessionFactory sf = config3.buildSessionFactory();
		    Session session = sf.openSession();

		    student s = session.get(student.class, id);

		    session.close();
		    sf.close();

		    return s;
		}
		
		

	
	@Override
	public List<student> getStudent() {

		Configuration config1 = new Configuration();

		Configuration config2 = config1.configure();

		Configuration config3 = config2.addAnnotatedClass(student.class);

	    SessionFactory sf = config3.buildSessionFactory();
	    Session session = sf.openSession();

	    List<student> list = session.createQuery("from student", student.class).list();

	    session.close();
	    sf.close();

	    return list;
	}

	
	
	
	@Override
	public boolean update_mobileNo(int Student_id, String MobileNo) {

	    Configuration config = new Configuration().configure().addAnnotatedClass(student.class);

	    SessionFactory sessionFactory = config.buildSessionFactory();

	    Session session = sessionFactory.openSession();

	    Transaction transaction = session.beginTransaction();

	    student s = session.get(student.class, Student_id);

	    if (s != null) {

	        s.setMobile(MobileNo);

	        session.update(s);

	        transaction.commit();

	        session.close();
	        sessionFactory.close();

	        return true;
	    }

	    session.close();
	    sessionFactory.close();

	    return false;
	}

		
		@Override
		public boolean delete_student(int Student_id) {

		    Configuration config = new Configuration()
		            .configure()
		            .addAnnotatedClass(student.class);

		    SessionFactory sessionFactory = config.buildSessionFactory();

		    Session session = sessionFactory.openSession();

		    Transaction transaction = session.beginTransaction();

		    student s = session.get(student.class, Student_id);

		    if (s != null) {

		        session.delete(s);

		        transaction.commit();

		        session.close();
		        sessionFactory.close();

		        return true;
		    }

		    session.close();
		    sessionFactory.close();

		    return false;
	}

	
	@Override
	public boolean updateCourse(int id, String course) {

	    Configuration config = new Configuration().configure().addAnnotatedClass(student.class);

	    SessionFactory sf = config.buildSessionFactory();
	    Session session = sf.openSession();

	    Transaction tx = session.beginTransaction();

	    student s = session.get(student.class, id);

	    if (s != null) {

	        s.setCourse(course);

	        session.update(s);

	        tx.commit();

	        session.close();
	        sf.close();

	        return true;
	    }

	    session.close();
	    sf.close();

	    return false;
	}


	

	@Override
	public boolean display_allStudent(student s) {
		// TODO Auto-generated method stub
		return false;
	}
		
	}
	
