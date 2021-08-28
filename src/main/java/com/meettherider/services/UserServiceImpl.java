package com.meettherider.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meettherider.entities.User;
import com.meettherider.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User insertUser(User user) {
		
		return this.userRepository.save(user);
	}

}
