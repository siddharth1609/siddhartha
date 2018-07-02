package com.siddhartha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siddhartha.model.LoginDTO;

@Repository
public interface LoginRepository extends JpaRepository<LoginDTO, Long> {

}
