package com.siddhartha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.siddhartha.model.LoginModel;
import com.siddhartha.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	// public static final Logger logger =
	// LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;
	// -------------------Create a
	// User-------------------------------------------

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody LoginModel login, UriComponentsBuilder ucBuilder) {
		// logger.info("Creating User : {}", login);

		// if (loginService.isUserExist(login)) {
		// logger.error("Unable to create. A User with name {} already exist",
		// login.getName());
		// return new ResponseEntity(new CustomErrorType("Unable to create. A
		// User with name " +
		// user.getName() + " already exist."),HttpStatus.CONFLICT);
		// }
		loginService.saveUser(login);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand(login.getId()).toUri());
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
}
