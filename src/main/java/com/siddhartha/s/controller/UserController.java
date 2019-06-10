package com.siddhartha.s.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.model.UserModel;
import com.siddhartha.s.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<UserEntity> createUser(@RequestBody UserModel user, UriComponentsBuilder ucBuilder) {
		UserEntity u = new UserEntity();
		// u = userService.findUserByEmail(user.getEmail());
		// u = userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
		return new ResponseEntity<UserEntity>(u, headers, HttpStatus.CREATED);
	}

	/*
	 * @GetMapping("/userById/{id}") public ResponseEntity<List<User>>
	 * getListOfUser(@PathVariable("id") long id, UriComponentsBuilder ucBuilder) {
	 * // User u = new User(); // u = userService.findUserByEmail(id); // u =
	 * userService.saveUser(user); List<User> l = new ArrayList<>(); l =
	 * userService.listOfUser(id); HttpHeaders headers = new HttpHeaders();
	 * headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
	 * return new ResponseEntity<List<User>>(l, HttpStatus.CREATED); }
	 */

	/*
	 * @GetMapping("/userById/{id}") public ResponseEntity<List<User>>
	 * getListOfUser(@PathVariable("id") long id, UriComponentsBuilder ucBuilder) {
	 * // User u = new User(); // u = userService.findUserByEmail(id); // u =
	 * userService.saveUser(user); List<User> l = new ArrayList<User>(); l =
	 * userService.listOfUser(id); // HttpHeaders headers = new HttpHeaders(); //
	 * headers.setLocation(ucBuilder.path("/api/user}").buildAndExpand().toUri());
	 * return new ResponseEntity<>(l, HttpStatus.CREATED); }
	 */

	@GetMapping("/userById")
	public List<UserModel> getUserList() {

		List<UserModel> userList = new ArrayList();
		userList = userService.getList();
		return userList;

	}

	@GetMapping("/up")
	public String checkHealth() {
		return "I am alive";
	}

}
