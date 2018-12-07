package io.medicalweb.server.model.principal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Doctor extends Person
{
	private String professionField;
	@OneToOne
	private PrincipalAuthentication	principalAuthentication;

	public PrincipalAuthentication getUserForm()
	{
		return principalAuthentication;
	}

	public void setUserForm(PrincipalAuthentication principalAuthentication)
	{
		this.principalAuthentication = principalAuthentication;
	}

	public Doctor()
	{
		super();
	}

	public Doctor(String cin, String firstname, String lastname, String phonenumber, Date dob, String email, String professionField, PrincipalAuthentication principalAuthentication)
	{
		super(cin, firstname, lastname, phonenumber, dob, email);
		this.professionField = professionField;
		this.principalAuthentication = principalAuthentication;

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
