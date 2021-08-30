package com.meettherider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meettherider.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	public Admin findByUsername(String username);
}
