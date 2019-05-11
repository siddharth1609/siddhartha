package com.siddhartha.s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siddhartha.s.domain.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRole(String role);

}
