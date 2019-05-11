package com.siddhartha.s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.siddhartha.s.domain.User;
import com.siddhartha.s.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	@Qualifier("userService")

	private UserService userService;

	// @RequestMapping(value = "/user", method = RequestMethod.POST)
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
		User u = new User();
		// u = userService.findUserByEmail(user.getEmail());
		u = userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
		return new ResponseEntity<User>(u, headers, HttpStatus.CREATED);
	}

	@GetMapping("/up")
	public String checkHealth() {
		return "I am alive";
	}

}
