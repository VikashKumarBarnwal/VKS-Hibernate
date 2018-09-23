/**
 * 
 */
package com.garg.model;

import java.util.Set;

/**
 * @author Orange PC
 *
 */
public class Employee {
	
	private int id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;
	   private Set<Certificate> certificates;
	
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set getCertificates() {
		return certificates;
	}

	public void setCertificates(Set certificates) {
		this.certificates = certificates;
	}

	public Employee(String firstName, String lastName, int salary, Set certificates) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.certificates = certificates;
	}
	
	

		
	
}
