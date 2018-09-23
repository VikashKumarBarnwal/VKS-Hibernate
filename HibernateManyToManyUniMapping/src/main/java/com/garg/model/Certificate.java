/**
 * 
 */
package com.garg.model;

import java.util.Set;

/**
 * @author Orange PC
 *
 */
public class Certificate {
	
	private int id;
	private String name;
	
	Set<Employee> employees;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
