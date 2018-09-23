/**
 * 
 */
package com.garg.model;

/**
 * @author Orange PC
 *
 */
public class Student {
	
	private int id;
	private String studentname;
	private String email;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Student(String studentname, String email) {
		super();
		this.studentname = studentname;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", email=" + email + "]";
	}
	
	
}
