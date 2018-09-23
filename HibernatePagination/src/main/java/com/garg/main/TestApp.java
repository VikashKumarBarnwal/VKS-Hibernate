/**
 * 
 */
package com.garg.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garg.model.Student;
import com.garg.util.HibernateUtil;

/**
 * @author Orange PC
 *
 */
public class TestApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			Session session   = HibernateUtil.getMysqlSession();
			tx = session.beginTransaction();
			String queryStr = "from Student st";
			Query query = session.createQuery(queryStr);
			query.setFirstResult(4);
			query.setMaxResults(5);
			List<Student> students = (List<Student>)query.list();
			for (Iterator iterator = students.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student);
				
			}
			
			
			tx.commit();
			System.out.println("DB operation Success");
		} catch (HibernateException e) {
			System.out.println("DB operation Failed");
			e.printStackTrace();
			tx.rollback();
		}catch (Exception e) {
			System.out.println("DB operation Failed");
			e.printStackTrace();
		}

	}

}
