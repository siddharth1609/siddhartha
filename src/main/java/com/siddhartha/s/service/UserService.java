package com.siddhartha.s.service;

import org.springframework.stereotype.Service;

import com.siddhartha.s.domain.User;

public interface UserService {

	User findUserByEmail(String email);
	
   public User saveUser(User user);		
	
}
