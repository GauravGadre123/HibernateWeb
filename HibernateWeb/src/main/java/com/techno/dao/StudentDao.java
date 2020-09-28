package com.techno.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techno.entites.Student;
import com.techno.utill.HibernateUtill;

public class StudentDao {

	public static boolean save(Student st) {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		return true;
	}

	public static List<Student> getAllStudents() {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		String HQL_QUERY = " from Student";

		Query query = session.createQuery(HQL_QUERY);

		List<Student> list = query.getResultList();
		tx.commit();
		session.close();
		return list;
	}

	public static Student getStudent(int id) {

		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		Student st= session.get(Student.class, id);
		tx.commit();
		session.close();
		return st;
	}

	public static boolean updateStudent(Student st) {
		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(st);
		tx.commit();
		session.close();
		return true;
	}

	public static boolean deleteStudent(int id) {
		
		SessionFactory sf = HibernateUtill.getSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		String HQL_QUERY = " delete from Student where id="+id;

		Query query = session.createQuery(HQL_QUERY);

		query.executeUpdate();	
		tx.commit();
		session.close();
		
		return true;
	}

}
