package net.java.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.springboot.model.User;
import net.java.springboot.repository.UserRepository;

@Service
public class UserService {
	
@Autowired	
	private UserRepository userRepository;

	public User createUser(User user)
	{
		return userRepository.save(user);
	}

}
