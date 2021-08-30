package com.meettherider.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meettherider.entities.Admin;
import com.meettherider.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin insertAdmin(Admin admin) {
		
		return this.adminRepository.save(admin);
	}

	@Override
	public boolean validate(String username, String password) {
		
		Admin admin = this.adminRepository.findByUsername(username);
		boolean check=false;
		
		if(admin == null)
		{
			check=false;
		}
		else if(password.equals(admin.getPassword()))
			
		{
			check=true;
		}
		return check;
		
	}

}
