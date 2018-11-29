package io.medicalweb.server.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.medicalweb.server.model.principal.UserLogin;
import io.medicalweb.server.service.principal.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = { "/", "/login" })
	public String login()
	{
		// return new ModelAndView("login", "userForm", new UserLogin());
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkAccess(@ModelAttribute("userForm") UserLogin user, Model model)
	{

		UserLogin userPerssisted = userService.getUser(user.getUsername());

		if (userService.getUser(user.getUsername()) != null && userPerssisted.getPassword().equals(user.getPassword()))
		{
		
			model.addAttribute("username", user.getUsername());
			return "home";
		}
		
		model.addAttribute("invalidCredentials", true);
		return "login";
				
	}
	
}
