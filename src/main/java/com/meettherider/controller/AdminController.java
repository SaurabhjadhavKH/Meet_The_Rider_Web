package com.meettherider.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meettherider.entities.Admin;
import com.meettherider.services.AdminService;



@RestController
public class AdminController {
	
	@Autowired
	private AdminService  adminService;
	

	@PostMapping("/admin")
	public Admin addadmin(@RequestBody Admin admin)
	{
		return this.adminService.insertAdmin(admin);
	}
	
	
	
	
	

}
