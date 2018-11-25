package io.medicalweb.server.model.principal;

import java.util.Date;

public class Doctor extends Person{
	
	private String role;

	public Doctor() {
		super();
		
	}

	public Doctor(int id, String cin, String firstname, String lastname, String phonenumber, Date dob, String email,
			String username, String password, String role) {
		super(id, cin, firstname, lastname, phonenumber, dob, email, username, password);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
