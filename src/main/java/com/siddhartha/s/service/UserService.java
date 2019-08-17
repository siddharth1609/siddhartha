package com.siddhartha.s.service;

import java.util.List;

import com.siddhartha.s.config.SiddharthException;
import com.siddhartha.s.entity.UserEntity;

public interface UserService {

	public UserEntity getEmployeeById(Long id) throws SiddharthException;

	public UserEntity getEmployeeByEmailId(String emailId) throws SiddharthException;

	public UserEntity createOrUpdateEmployee(UserEntity employee);

	public List<UserEntity> getALlEmployee() throws SiddharthException;

	public String deleteEmployeeById(String id) throws SiddharthException;

}
