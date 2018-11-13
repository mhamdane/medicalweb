package io.medicalweb.server.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController
{
	@RequestMapping("/login")
	public String checkAccess()
	{
		return "Hello Doctor";
	}
}
