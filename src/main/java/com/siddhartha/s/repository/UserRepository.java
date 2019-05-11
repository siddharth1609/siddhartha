package com.siddhartha.s.repository;

import org.springframework.stereotype.Repository;

import com.siddhartha.s.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findUserByEmail(String email);

}
