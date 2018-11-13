package io.medicalweb.server.controller.developers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.medicalweb.server.dto.developers.Developer;
import io.medicalweb.server.service.developers.DevelopersService;

@RestController
public class DevelopersController
{

	@Autowired
	private DevelopersService developersService;

	@RequestMapping("/developpers")
	public List<Developer> getAllDeveloppers()
	{
		return developersService.getAllDeveloppers();
	}

	@RequestMapping("/developpers/{id}")
	public Developer getDeveloper(@PathVariable String id)
	{
		return developersService.getDeveloper(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/developpers")
	public void addDeveloper(@RequestBody Developer developer)
	{
		developersService.addDeveloper(developer);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/developpers/{id}")
	public void updateDeveloper(@RequestBody Developer developer, @PathVariable String id)
	{
		developersService.updateDeveloper(id, developer);

	}
}
