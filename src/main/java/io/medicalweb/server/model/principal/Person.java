package io.medicalweb.server.model.principal;

import java.util.Date;

public class Person extends UserLogin{
	
	private int id;
	private String cin; 
	private String firstname;
	private String lastname;
	private String phonenumber;
	private Date dob;
	private String email;	
	
	public Person() {
		super();
	}
	
	public Person(int id, String cin, String firstname, String lastname, String phonenumber, Date dob, String email, String username, String password) {
		super(username,password);
		this.id = id;
		this.cin = cin;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.dob = dob;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
