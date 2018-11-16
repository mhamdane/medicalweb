package io.medicalweb.server.controller.developer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.medicalweb.server.model.developer.Developer;
import io.medicalweb.server.service.developer.DevelopersService;

@RestController
public class DevelopersController
{

	@Autowired
	private DevelopersService developersService;

	@RequestMapping("/developers")
	public List<Developer> getAllDeveloppers()
	{
		return developersService.getAllDeveloppers();
	}

	@RequestMapping("/developers/{id}")
	public Developer getDeveloper(@PathVariable String id)
	{
		return developersService.getDeveloper(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/developers")
	public void addDeveloper(@RequestBody Developer developer)
	{
		developersService.addDeveloper(developer);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/developers/{id}")
	public void updateDeveloper(@RequestBody Developer developer, @PathVariable String id)
	{
		developersService.updateDeveloper(id, developer);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/developers/{id}")
	public void deleteDeveloper(@PathVariable String id)
	{
		developersService.deleteDeveloper(id);

	}

}
