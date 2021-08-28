package com.meettherider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meettherider.entities.User;
import com.meettherider.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return this.userService.insertUser(user);
	}

}
