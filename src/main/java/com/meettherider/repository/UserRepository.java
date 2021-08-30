package com.meettherider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meettherider.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
