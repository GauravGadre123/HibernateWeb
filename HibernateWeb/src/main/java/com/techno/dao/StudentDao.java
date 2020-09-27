package com.techno.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.techno.entites.Student;
import com.techno.utill.HibernateUtill;

public class StudentDao {

	public static boolean save(Student st) {

		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st);
		transaction.commit();
		session.close();
		return true;
	}

	public static List<Student> getAllStudents() {
		Session session = HibernateUtill.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		

		String HQL_QUERY = " from Student";

		Query query = session.createQuery(HQL_QUERY);

		List<Student> list = query.getResultList();
		transaction.commit();
		session.close();
		return list;
	}

}
