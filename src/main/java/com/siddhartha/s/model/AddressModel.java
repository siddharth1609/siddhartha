package com.siddhartha.s.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddressModel implements Serializable {

	private Long address_id;
	private long user_id;
	private String street;

	private String city;

	private String state;

	private String country;

	private String pinCode;

}
