package com.siddhartha.s.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserModel implements Serializable {

	private Long user_id;
	private String firstName;

	private String lastName;

	private String email;

	private int mobileNo;

	private AddressModel addressModel;

}
