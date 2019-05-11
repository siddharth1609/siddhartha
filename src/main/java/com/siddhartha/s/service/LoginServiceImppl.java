package com.siddhartha.s.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhartha.s.domain.User;
import com.siddhartha.s.repository.LoginRepository;
import com.siddhartha.s.utils.UserMapper;

@Service
public class LoginServiceImppl implements LoginService {

	//@Autowired
//	LoginRepository loginRepository;

	@Override
	public List<User> findAll() {
		// List<User> users = new ArrayList<>();
		// LoginDTO dto = new LoginDTO();
		// dto = loginRepository.
		// User user = UserMapper.INSTANCE.userToLoginTDO(dto);

		// users =
		// LoginMapper.INSTANCE.LoginModelListToLoginDTOList(loginRepository.findAll());
		//return UserMapper.INSTANCE.listusertologinTDO(loginRepository.findAll());
		return null;
	}

}
