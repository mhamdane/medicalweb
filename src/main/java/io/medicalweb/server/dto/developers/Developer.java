package io.medicalweb.server.dto.developers;

public class Developer
{

	private String	id;
	private String	name;
	private String	title;
	private String	email;

	public Developer()
	{
		super();

	}

	public Developer(String id, String name, String title, String email)
	{
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.email = email;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

}
