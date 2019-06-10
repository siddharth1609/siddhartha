package com.siddhartha.s.service;

import java.util.List;

import com.siddhartha.s.model.UserModel;

public interface UserService {

	// UserEntity findUserByEmail(String email);

	/*
	 * public UserModel saveUser(UserModel user);
	 * 
	 * List<UserModel> listOfUser(Long id);
	 */

	List<UserModel> getList();

}
