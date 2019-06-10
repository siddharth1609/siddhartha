package com.siddhartha.s.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ROLE")
public class RoleEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="ROLE_ID")
	private int id;
	
	@Column(name ="ROLE")
	private String role;

}
