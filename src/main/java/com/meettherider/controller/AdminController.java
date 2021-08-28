package com.meettherider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.meettherider.entities.Admin;
import com.meettherider.services.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService  adminService;
	

	@GetMapping("/admin")
	public Admin addadmin(@RequestBody Admin admin)
	{
		return this.adminService.insertAdmin(admin);
	}
	
	
	

}
