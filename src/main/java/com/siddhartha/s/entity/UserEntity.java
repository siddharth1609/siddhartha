package com.siddhartha.s.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

@Entity
@Table(name = "USERS")
public class UserEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "USER_SEQ")
	private Long user_id;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILENO")
	private int mobileNo;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private AddressEntity addressEntity;

	/*
	 * @OneToMany(cascade=CascadeType.ALL)
	 * 
	 * @Column(name ="ADDRESS") private Address Adress;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @PrimaryKeyJoinColumn // @JoinTable(joinColumns = @JoinColumn(name =
	 * "USER_ID"), inverseJoinColumns = // @JoinColumn(name = "ADDRESS_ID")) //
	 * List<Address> addressList = new ArrayList<Address>(); private Address
	 * addressObj;
	 * 
	 * @Column(name = "ACTIVE") private int Active;
	 * 
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "users_id"),
	 * inverseJoinColumns = @JoinColumn(name = "role_id")) private Set<Role> Roles;
	 */
}
