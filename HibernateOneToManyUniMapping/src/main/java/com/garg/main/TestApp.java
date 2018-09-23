/**
 * 
 */
package com.garg.main;

import java.util.HashSet;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garg.model.Employee;
import com.garg.model.Certificate;
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
			//Certificate cust = new Certificate("MBA");
			
			
			
			HashSet set1 = new HashSet();
			set1.add(new Certificate("MBA"));
			set1.add(new Certificate("MCA"));
			
			Employee add = new Employee("Sourav","Garg",10000,set1);
			
			session.save(add);
			session.ev
			//tx.commit();
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
