/**
 * 
 */
package com.garg.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.garg.model.Customer;
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
			//Session session1   = HibernateUtil.getMysqlSession();
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session1   = sf.openSession();
			 tx = session1.beginTransaction();
			/*Customer cust = new Customer("vikash","vikash@gmail.com","bangalore","8951684675","abc");
			session.save(cust);*/
			 
			 String query = "from Customer";
			 Query q = session1.createQuery(query);
			 q.setCacheable(true);
			List<Customer> customers = q.list();
			for(Customer cs: customers)
			{
			  System.out.println(cs);
			}
			 
					 
			tx.commit();
			session1.close();
			System.out.println("DB operation Success");
			
			Session session2   = sf.openSession();
			tx = session2.beginTransaction();
			
			
			String query1 = "from Customer";
			 Query q1 = session2.createQuery(query1);
			 q.setCacheable(true);
			List<Customer> customers1 = q1.list();
			for(Customer cs: customers1)
			{
			  System.out.println(cs);
			}
			tx.commit();
			session2.close(); 
			System.out.println("DB operation Success1");
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
