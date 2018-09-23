/**
 * 
 */
package com.garg.pk;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

/**
 * @author Orange PC
 *
 */
public class KeyGeneration implements IdentifierGenerator {
	
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	    Calendar cd = Calendar.getInstance();
	    Date dt= cd.getTime();
	    double  num = Math.random();
	    String key =dt.toString()+"0000"+ (Double.valueOf(num)).toString();
	    System.out.println("generated key ="+key);
		return key;
	}

}
