package io.medicalweb.server.model.principal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Principal
{
	@Id
	private String	cin;
	private String firstname;
	private String lastname;
	private String phonenumber;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dob;
	private String					email;
	@OneToOne
	private PrincipalAuthentication	principalAuthentication;

	public Principal() {
		super();
	}
	
	public Principal(String cin, String firstname, String lastname, String phonenumber, Date dob, String email, PrincipalAuthentication principalAuthentication)
	{
		this.cin = cin;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.dob = dob;
		this.email = email;
		this.principalAuthentication = principalAuthentication;
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

	public PrincipalAuthentication getPrincipalAuthentication()
	{
		return principalAuthentication;
	}

	public void setPrincipalAuthentication(PrincipalAuthentication principalAuthentication)
	{
		this.principalAuthentication = principalAuthentication;
	}

}
