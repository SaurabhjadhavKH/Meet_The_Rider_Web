package com.meettherider.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meettherider.entities.Admin;
import com.meettherider.repository.AdminRespository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRespository adminRespository;
	

	@Override
	public Admin insertAdmin(Admin admin) {
		
		return adminRespository.save(admin);
	}


	@Override
	public boolean validate(String username, String password) {
	
		Admin pass = this.adminRespository.findByUsername(username);
		
		boolean check=false;
		
		if(pass == null)
		{
			check= false;
		}else if(password.equals(pass.getPassword())) {
			check= true;
		}
		return check;
		
		
	}


	

}
