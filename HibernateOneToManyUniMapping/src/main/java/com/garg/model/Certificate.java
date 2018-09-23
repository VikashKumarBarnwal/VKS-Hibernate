/**
 * 
 */
package com.garg.model;

/**
 * @author Orange PC
 *
 */
public class Certificate {
	
	private int id;
	private String name;
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
	
}
