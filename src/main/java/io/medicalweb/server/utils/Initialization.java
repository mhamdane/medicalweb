package io.medicalweb.server.utils;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.medicalweb.server.model.principal.Principal;
import io.medicalweb.server.model.principal.PrincipalAuthentication;
import io.medicalweb.server.service.principal.PrincipalAuthenticationService;
import io.medicalweb.server.service.principal.PrincipalService;

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
	private PrincipalAuthenticationService		principalAuthenticationService;

	@Autowired
	private PrincipalService				principalService;

	@PostConstruct
	public void init()
	{
		LOG.info("spring.jpa.hibernate.ddl-auto={}", hibernateValue);
		if ("create".equals(hibernateValue) || "create-drop".equals(hibernateValue))
		{
			principalAuthenticationService.addPrincipalAuthentication(new PrincipalAuthentication(username, password));
			
			principalService.addPrincipal(
					new Principal("X26892", "Hicham", "SERHANI", "0668831210", new Date(), "hserhani8@gmail.com", principalAuthenticationService.getPrincipalAuthentication(username)));
			LOG.info("---Administrator created with success---");
		}
		else {
			LOG.info("---Administrator already created---");
		}

	}

}
