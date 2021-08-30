package com.meettherider.service;



import com.meettherider.entities.Admin;

public interface AdminService {
	
	public Admin insertAdmin(Admin admin);
	
	public boolean validate(String username, String password);

}
