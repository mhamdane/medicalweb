package io.medicalweb.server.utils;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.medicalweb.server.model.principal.UserLogin;
import io.medicalweb.server.service.principal.UserService;

@Component
public class Initialization
{
	private final static Logger	LOG	= LogManager.getLogger();

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String				hibernateValue;
	
	@Value("${medicalweb.administrator.username}")
	private String username;
	
	@Value("${medicalweb.administrator.password}")
	private String password;

	@Autowired
	private UserService userService;

	@PostConstruct
	public void init()
	{
		LOG.info("spring.jpa.hibernate.ddl-auto={}", hibernateValue);
		if ("create".equals(hibernateValue) || "create-drop".equals(hibernateValue))
		{
			userService.addUser(new UserLogin(username, password));
			LOG.info("---Administrator created with success---");
		}
		else {
			LOG.info("---Administrator already created---");
		}

	}

}
