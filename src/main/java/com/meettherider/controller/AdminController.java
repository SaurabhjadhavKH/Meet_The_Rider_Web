package com.meettherider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meettherider.entities.Admin;
import com.meettherider.services.AdminService;



@Controller
public class AdminController {
	
	@Autowired
	private AdminService  adminService;
	

	@PostMapping("/admin")
	public Admin addadmin(@RequestBody Admin admin)
	{
		return this.adminService.insertAdmin(admin);
	}
	
	

	
	@GetMapping("/")
	public String login(Model model)
	{
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		
		return "index";
		
	}
	
	
	@PostMapping("/adminValidate")
	public String adminValidate(@ModelAttribute Admin admin)
	{
		if(this.adminService.validate(admin.getUsername(), admin.getPassword()))
		{
			System.out.println("true");
			return "home";
		}else {
			System.out.println("false");
			return "redirect:/";
			
		}
	}
	
	
	
	
	
	
	
	
	
	

}
