/**
 * 
 */
package com.garg.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.garg.model.Account;
import com.garg.model.CurrentAccount;
import com.garg.model.SavingAccount;
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
			 //Account acc = new Account("334455","Saurav", new Date());
			 SavingAccount acc = new SavingAccount("334455","Saurav", new Date(),500,8);
			 session.save(acc);
			
			 CurrentAccount acc1 = new CurrentAccount("556677", "Saurav", new Date(), 10000, 3);
		    session.save(acc1);
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
