package io.medicalweb.server.service.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.principal.Principal;
import io.medicalweb.server.repository.PrincipalRepository;

@Service
public class PrincipalService {
	
	@Autowired
	private PrincipalRepository principalRepository;
	
	public Principal getPrincipal(String cin)
	{
		return principalRepository.findOne(cin);
	}
	
	public void addPrincipal(Principal principal)
	{
		principalRepository.save(principal);
	}

}
