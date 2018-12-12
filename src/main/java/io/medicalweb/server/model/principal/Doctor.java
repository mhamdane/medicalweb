package io.medicalweb.server.model.principal;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Doctor extends Principal
{
	private String professionField;

	public Doctor()
	{
		super();
	}

	public Doctor(String cin, String firstname, String lastname, String phonenumber, Date dob, String email, PrincipalAuthentication principalAuthentication, String professionField)
	{
		super(cin, firstname, lastname, phonenumber, dob, email, principalAuthentication);
		this.professionField = professionField;
	}

	public String getProfessionField()
	{
		return professionField;
	}

	public void setProfessionField(String professionField)
	{
		this.professionField = professionField;
	}

}
