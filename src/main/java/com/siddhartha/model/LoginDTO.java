package com.siddhartha.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "TBL_LOGIN")
// @Data
public class LoginDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login_Sequence")
	@SequenceGenerator(name = "login_Sequence", sequenceName = "LOGIN_SEQ")
	private Long id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Mobile_No")
	private String Mobile_No;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile_No() {
		return Mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		Mobile_No = mobile_No;
	}

}
