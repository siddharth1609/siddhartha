package com.siddhartha.s.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhartha.s.entity.UserEntity;

//@Repository("userRepository")
//@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findUserByEmail(String email);

}
