package com.siddhartha.s.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddhartha.s.config.SiddharthException;
import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/createOrUpdateEmployee")
	public ResponseEntity<UserEntity> createOrUpdateEmployee(@RequestBody UserEntity employee)
			throws SiddharthException {
		UserEntity updated = userService.createOrUpdateEmployee(employee);
		return new ResponseEntity<UserEntity>(updated, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("getEmployeeById/{id}")
	public ResponseEntity<UserEntity> getEmployeeById(@PathVariable("id") Long id) throws SiddharthException {
		UserEntity user = userService.getEmployeeById(id);

		return new ResponseEntity<UserEntity>(user, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("getEmployeeByEmailId/{email}")
	public ResponseEntity<UserEntity> getEmployeeByEmailId(@PathVariable("email") String emailId)
			throws SiddharthException {
		UserEntity user = userService.getEmployeeByEmailId(emailId);
		return new ResponseEntity<UserEntity>(user, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<UserEntity>> getAllEmployees() {
		List<UserEntity> list = userService.getALlEmployee();

		return new ResponseEntity<List<UserEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/up")
	public String checkHealth() {
		return "I am alive";
	}

}
