/**
 * 
 */
package com.garg.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Orange PC
 *
 */
public class HibernateUtil {
	
	private static SessionFactory    sessionOraFactory = null;
	private static SessionFactory    sessionMysqlFactory = null;
	
	
	public static SessionFactory getOraSessionFactory() {
		if (sessionOraFactory ==null) {
			Configuration cfg = new Configuration().configure("Ora_hibernate.cfg.xml");
			sessionOraFactory = cfg.buildSessionFactory();
		}
		
		return sessionOraFactory;
	}
	
	public static SessionFactory getMysqlSessionFactory() {
		if (sessionMysqlFactory ==null) {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			sessionMysqlFactory = cfg.buildSessionFactory();
		}
		return sessionMysqlFactory;
	}
	
	
	
	public static Session getMysqlSession() {
		System.out.println("HibernateUtil -> session");
		return getMysqlSessionFactory().openSession();
	}

}
