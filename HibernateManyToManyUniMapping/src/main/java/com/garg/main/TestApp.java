/**
 * 
 */
package com.garg.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.garg.model.Certificate;
import com.garg.model.Employee;
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
			set1.add(new Certificate("BBA"));
			set1.add(new Certificate("BE"));
			
			Employee e1 = new Employee("Rahul","Gupta",10000);
			e1.setCertificates(set1);
			
			session.save(e1);
			
			Certificate cert = new Certificate("CompSc");
			Set<Employee> empset = new HashSet<Employee>();
			Employee e2 = new Employee("vikash","Gupta",10000);
			Employee e3 = new Employee("saurav","Gupta",10000);
			empset.add(e2);
			empset.add(e3);
			
			
			cert.setEmployees(empset);
			session.save(cert);
			
		
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
