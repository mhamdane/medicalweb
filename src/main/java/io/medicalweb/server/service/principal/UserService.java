package io.medicalweb.server.service.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.principal.UserForm;
import io.medicalweb.server.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository	userRepository;
	
	public UserForm getUser(String username)
	{
		return userRepository.findOne(username);
	}
	
	public void addUser(UserForm user)
	{
		userRepository.save(user);
	}

}
