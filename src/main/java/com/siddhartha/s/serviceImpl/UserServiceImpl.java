package com.siddhartha.s.serviceImpl;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.siddhartha.s.domain.Role;
import com.siddhartha.s.domain.User;
import com.siddhartha.s.repository.RoleRepository;
import com.siddhartha.s.repository.UserRepository;
import com.siddhartha.s.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository  userRepository;
	
	@Autowired
	@Qualifier("roleRepository")
	private RoleRepository  roleRepository;
	
	 //@Autowired
//	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public User findUserByEmail(String user) {
		return userRepository.findUserByEmail(user);
	}

	@Override
	public User saveUser(User user) {
		
		  //user.setActive(1);
		  Role userRole = roleRepository.findByRole("admin");
		  user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		
		return userRepository.save(user);
		
	}

}
