package io.medicalweb.server.service.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.principal.PrincipalAuthentication;
import io.medicalweb.server.repository.PrincipalAuthenticationRepository;

@Service
public class PrincipalAuthenticationService {
	
	@Autowired
	private PrincipalAuthenticationRepository	principalAuthenticationRepository;
	
	public PrincipalAuthentication getPrincipalAuthentication(String username)
	{
		return principalAuthenticationRepository.findOne(username);
	}
	
	public void addPrincipalAuthentication(PrincipalAuthentication principalAuthentication)
	{
		principalAuthenticationRepository.save(principalAuthentication);
	}

}
