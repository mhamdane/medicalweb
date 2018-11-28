package io.medicalweb.server.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import io.medicalweb.server.model.principal.UserLogin;
import io.medicalweb.server.service.principal.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		return login();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public ModelAndView login()
	{
		return new ModelAndView("login", "userlogin", new UserLogin());
	}
	
	@RequestMapping("/user")
	public void addUser()
	{
		UserLogin usertest = new UserLogin("hserhani", "changeme");
		userService.addUser(usertest);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/welcome")
	public String checkAccess(@ModelAttribute("userlogin") UserLogin user, Model model)
	{

		UserLogin userPerssisted = userService.getUser(user.getUsername());

		if (userPerssisted.getPassword().equals(user.getPassword()))
		{
		
			model.addAttribute("username", user.getUsername());
			return "welcome";
		}
		
		else return "loginfailed";
				
	}
	
}
