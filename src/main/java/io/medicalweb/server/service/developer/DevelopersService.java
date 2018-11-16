package io.medicalweb.server.service.developer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.developer.Developer;
import io.medicalweb.server.repository.DeveloperRepository;

@Service
public class DevelopersService
{
	@Autowired
	private DeveloperRepository	developerRepository;

	/*
	 * private List<Developer> developers = new ArrayList<>(Arrays.asList(new Developer("1",
	 * "Hicham SERHANI", "DevOps Engineer", "hserhani@percallgroup.com"),
	 * new Developer("2", "Amine HAMDANE", "DevOps Engineer", "mhamdane@percallgroup.com"), new
	 * Developer("3", "Marouane Taour", "Project Manager", "mtaour@percallgroup.com")));
	 */

	public List<Developer> getAllDeveloppers()
	{
		// return developers;
		List<Developer> developers = new ArrayList<>();
		developerRepository.findAll().forEach(developers::add);
		return developers;
	}

	public Developer getDeveloper(String id)
	{
		// return developers.stream().filter(d -> d.getId().equals(id)).findFirst().get();
		return developerRepository.findOne(id);
	}

	public void addDeveloper(Developer developer)
	{
		// developers.add(developer);
		developerRepository.save(developer);

	}

	public void updateDeveloper(String id, Developer developer)
	{
		/*
		 * for (int i=0; i<developers.size(); i++ )
		 * {
		 * Developer d = developers.get(i);
		 * if (d.getId().equals(id))
		 * developers.set(i, developer);
		 * return;
		 * }
		 */
		developerRepository.save(developer);

	}

	public void deleteDeveloper(String id)
	{
		// developers.removeIf(d -> d.getId().equals(id));
		developerRepository.delete(id);
		
	}

}
