package io.medicalweb.server.service.developers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.medicalweb.server.dto.developers.Developer;

@Service
public class DevelopersService
{

	private List<Developer> developpers = new ArrayList<>(Arrays.asList(new Developer("1", "Hicham SERHANI", "DevOps Engineer", "hserhani@percallgroup.com"),
			new Developer("2", "Amine HAMDANE", "DevOps Engineer", "mhamdane@percallgroup.com"), new Developer("3", "Marouane Taour", "Project Manager", "mtaour@percallgroup.com")));

	public List<Developer> getAllDeveloppers()
	{
		return developpers;
	}

	public Developer getDeveloper(String id)
	{
		return developpers.stream().filter(d -> d.getId().equals(id)).findFirst().get();
	}

	public void addDeveloper(Developer developer)
	{
		developpers.add(developer);

	}

	public void updateDeveloper(String id, Developer developer)
	{
		for (Developer d : developpers)
		{


		}
	}

}