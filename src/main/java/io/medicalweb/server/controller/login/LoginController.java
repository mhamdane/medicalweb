package io.medicalweb.server.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
	@RequestMapping("/")
	public String index()
	{
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkAccess(@RequestParam("uname") String uname, Model model)
	{
		model.addAttribute("uname", uname);
		return "welcome";
	}
	
}
