/**
 * 
 */
package com.garg.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garg.model.Customer;

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
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session   = sf.openSession();
			 tx = session.beginTransaction();
			Customer cust = new Customer("vikash","vikash@gmail.com","bangalore","8951684675","abc");
			session.save(cust);
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
