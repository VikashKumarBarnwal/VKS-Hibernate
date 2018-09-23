/**
 * 
 */
package com.garg.model;

import java.util.Date;
import java.util.Set;

/**
 * @author Orange PC
 *
 */
public class CurrentAccount extends Account{
	
	   private int cuAccId;
	   private int maxWithDrowLimit; 
	   private int  simpleIntr; 
	  
	  
	
	public CurrentAccount() {
		super();
	}
	
	public CurrentAccount(String accNumber, String accountHolder, Date openDate, int maxWithDrowLimit, int simpleIntr) {
		super(accNumber,accountHolder,openDate);
		this.maxWithDrowLimit = maxWithDrowLimit;
		this.simpleIntr = simpleIntr;
	}

	public int getCuAccId() {
		return cuAccId;
	}



	public void setCuAccId(int cuAccId) {
		this.cuAccId = cuAccId;
	}



	public int getMaxWithDrowLimit() {
		return maxWithDrowLimit;
	}



	public void setMaxWithDrowLimit(int maxWithDrowLimit) {
		this.maxWithDrowLimit = maxWithDrowLimit;
	}



	public int getSimpleIntr() {
		return simpleIntr;
	}



	public void setSimpleIntr(int simpleIntr) {
		this.simpleIntr = simpleIntr;
	}



	



	
}
