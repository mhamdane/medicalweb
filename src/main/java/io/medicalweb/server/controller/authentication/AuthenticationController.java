package io.medicalweb.server.controller.authentication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.medicalweb.server.model.dto.principal.UserDTO;
import io.medicalweb.server.model.principal.PrincipalAuthentication;
import io.medicalweb.server.service.principal.PrincipalAuthenticationService;

@Controller
public class AuthenticationController
{
	@Autowired
	private PrincipalAuthenticationService	principalAuthenticationService;
	private PrincipalAuthentication			principalAuthentication;
	private final static Logger	LOG	= LogManager.getLogger();
	
	@RequestMapping(method = RequestMethod.GET, value = { "/", "/login" })
	public String login()
	{
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model)
	{
		if (principalAuthentication != null)
		{
			LOG.info("---User \"{}\" was granted to access the home page---", principalAuthentication.getUsername());
			model.addAttribute("username", principalAuthentication.getUsername());
			return "home";
		}
		LOG.info("---Attempt to access home page without authentication---");
		return "redirect:login";

	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkAccess(@ModelAttribute("userDTO") UserDTO userDTO, Model model)
	{
		principalAuthentication = principalAuthenticationService.getPrincipalAuthentication(userDTO.getUsername());

		if (principalAuthenticationService.getPrincipalAuthentication(userDTO.getUsername()) != null && principalAuthentication.getPassword().equals(userDTO.getPassword()))
		{
			return "redirect:home";
		}
		
		LOG.info("---User \"{}\" was NOT granted to access the home page---", userDTO.getUsername());
		model.addAttribute("invalidCredentials", true);
		return "login";
				
	}
	
}