package com.meettherider.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meettherider.entities.User;
import com.meettherider.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		return this.userService.insertUser(user);
	}
	
	@GetMapping("/register")
	public String userRegister(Model model)
	{
		System.out.println("errror");
		User user = new User();
		model.addAttribute("user", user);
		return "registeration_form";
	}
	
	
	
	
	@PostMapping("/userinfo")
	public String userdata(@Valid @ModelAttribute("user")  User user , Model model, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
		}
		
		
		return "home";
	}
	
	
	
	
	

}
