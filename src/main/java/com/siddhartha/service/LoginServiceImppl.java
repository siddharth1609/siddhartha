package com.siddhartha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhartha.model.LoginModel;
import com.siddhartha.repository.LoginRepository;

@Service
public class LoginServiceImppl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean saveUser(LoginModel login) {
		// loginRepository.save(login);
		return true;
	}

}
