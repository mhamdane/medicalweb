package io.medicalweb.server.service.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.principal.UserLogin;
import io.medicalweb.server.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository	userRepository;
	
	public UserLogin getUser(String username)
	{
		return userRepository.findOne(username);
	}
	
	public void addUser(UserLogin user)
	{
		userRepository.save(user);
	}

}
