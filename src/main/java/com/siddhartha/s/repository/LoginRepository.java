package com.siddhartha.s.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhartha.s.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

}
