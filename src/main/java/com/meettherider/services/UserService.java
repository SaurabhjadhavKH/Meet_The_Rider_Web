package com.meettherider.services;

import com.meettherider.entities.User;

public interface UserService {
	
	public User insertUser(User user);
	
	public User registerUser(User user);

}
