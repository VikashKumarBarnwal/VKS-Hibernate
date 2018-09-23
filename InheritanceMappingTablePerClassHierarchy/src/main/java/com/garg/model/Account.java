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
public class Account {
	
	private int accId;
	private String accNumber;
	private String accountHolder;
	public Account() {
	}
	
	
	public Account(String accNumber, String accountHolder, Date openDate) {
		super();
		this.accNumber = accNumber;
		this.accountHolder = accountHolder;
		this.openDate = openDate;
	}
	
	public Account(int accId, String accNumber, String accountHolder, Date openDate) {
		super();
		this.accId = accId;
		this.accNumber = accNumber;
		this.accountHolder = accountHolder;
		this.openDate = openDate;
	}
	private Date openDate;
	
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	

	
	
}
