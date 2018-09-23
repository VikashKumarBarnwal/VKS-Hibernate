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
public class SavingAccount extends Account{
	
	  



	  private int saAccId;
	   private int minBal; 
	   private int compoundIntr; 
	  
	  
   public SavingAccount(String accNumber, String accountHolder, Date openDate,int minBal, int compoundIntr) {
		super(accNumber,accountHolder,openDate);
		this.minBal = minBal;
		this.compoundIntr = compoundIntr;
	}
	public SavingAccount() {
		super();
	}



	public int getSaAccId() {
		return saAccId;
	}



	public void setSaAccId(int saAccId) {
		this.saAccId = saAccId;
	}



	public int getMinBal() {
		return minBal;
	}



	public void setMinBal(int minBal) {
		this.minBal = minBal;
	}



	public int getCompoundIntr() {
		return compoundIntr;
	}



	public void setCompoundIntr(int compoundIntr) {
		this.compoundIntr = compoundIntr;
	}
}
