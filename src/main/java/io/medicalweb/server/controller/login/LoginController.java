package io.medicalweb.server.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.medicalweb.server.model.principal.UserLogin;
import io.medicalweb.server.service.principal.UserService;

@Controller
public class LoginController
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index()
	{
		return login();
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/welcome")
	public String checkAccess(@RequestBody UserLogin user, Model model)
	{
		UserLogin usertest = new UserLogin("hserhani","changeme");
		userService.addUser(usertest);
		
		if (userService.getUser(user.getUsername()).getPassword().equals(user.getPassword())){
		
			model.addAttribute("username", user.getUsername());
			return "welcome";
		}
		
		else return "loginfailed";
				
	}
	
}
