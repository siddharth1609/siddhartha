package com.siddhartha.service;

import com.siddhartha.model.LoginModel;

public interface LoginService {

	// public boolean findById(Locale locale, Long id);
	public boolean saveUser(LoginModel login);

}
