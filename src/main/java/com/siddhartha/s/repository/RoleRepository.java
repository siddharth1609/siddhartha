package com.siddhartha.s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siddhartha.s.entity.RoleEntity;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	
	RoleEntity findByRole(String role);

}
