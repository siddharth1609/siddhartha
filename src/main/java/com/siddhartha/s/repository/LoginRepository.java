package com.siddhartha.s.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhartha.s.domain.LoginDTO;

public interface LoginRepository extends JpaRepository<LoginDTO, Long> {

}
