package io.medicalweb.server.controller.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.medicalweb.server.model.principal.UserForm;
import io.medicalweb.server.service.principal.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	private UserForm	userPerssisted;
	private final static Logger	LOG	= LogManager.getLogger();
	
	@RequestMapping(method = RequestMethod.GET, value = { "/", "/login" })
	public String login()
	{
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model)
	{
		if (userPerssisted != null)
		{
			LOG.info("---User \"{}\" was granted to access the home page---", userPerssisted.getUsername());
			model.addAttribute("username", userPerssisted.getUsername());
			return "home";
		}
		LOG.info("---Attempt to access home page without authentication---");
		return "redirect:login";

	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkAccess(@ModelAttribute("userForm") UserForm user, Model model)
	{
		userPerssisted = userService.getUser(user.getUsername());

		if (userService.getUser(user.getUsername()) != null && userPerssisted.getPassword().equals(user.getPassword()))
		{
			return "redirect:home";
		}
		
		LOG.info("---User \"{}\" was NOT granted to access the home page---", user.getUsername());
		model.addAttribute("invalidCredentials", true);
		return "login";
				
	}
	
}
