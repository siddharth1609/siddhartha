/*
 * package com.siddhartha.s.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController; import
 * org.springframework.web.util.UriComponentsBuilder;
 * 
 * import com.siddhartha.s.entity.UserEntity; import
 * com.siddhartha.s.service.LoginServiceImppl;
 * 
 * @RestController
 * 
 * @RequestMapping("/api") public class LoginController {
 * 
 * // public static final Logger logger = //
 * LoggerFactory.getLogger(LoginController.class);
 * 
 * @Autowired private LoginServiceImppl loginServiceImppl; //
 * -------------------Create a //
 * User-------------------------------------------
 * 
 * //@RequestMapping(value = "/users", method = RequestMethod.POST) public
 * ResponseEntity<?> createUser(@RequestBody UserEntity login,
 * UriComponentsBuilder ucBuilder) { // logger.info("Creating User : {}",
 * login);
 * 
 * // if (loginService.isUserExist(login)) { //
 * logger.error("Unable to create. A User with name {} already exist", //
 * login.getName()); // return new ResponseEntity(new CustomErrorType("Unable to
 * create. A // User with name " + // user.getName() +
 * " already exist."),HttpStatus.CONFLICT); // } //
 * loginService.saveUser(login);ffffrDdxxxxxxxxxxxxxxxxSa V 1C
 * 
 * HttpHeaders headers = new HttpHeaders();
 * headers.setLocation(ucBuilder.path("/api/user/{id}").buildAndExpand().toUri()
 * ); return new ResponseEntity<String>(headers, HttpStatus.CREATED); }
 * 
 * @RequestMapping(value = "/findalluser", method = RequestMethod.GET) public
 * List<UserEntity> retriveAllUser() {
 * 
 * return loginServiceImppl.findAll(); }
 * 
 * }
 */