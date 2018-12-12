package io.medicalweb.server.model.dto.principal;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DoctorDTO
{
	private String	cin;
	private String	firstname;
	private String	lastname;
	private String	phonenumber;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date	dob;
	private String	email;
	private String	professionField;
	private String	username;
	private String	password;

	public String getCin()
	{
		return cin;
	}

	public void setCin(String cin)
	{
		this.cin = cin;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getProfessionField()
	{
		return professionField;
	}

	public void setProfessionField(String professionField)
	{
		this.professionField = professionField;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}
