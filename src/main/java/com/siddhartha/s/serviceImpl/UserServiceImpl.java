package com.siddhartha.s.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siddhartha.s.config.SiddharthException;
import com.siddhartha.s.constant.Constant;
import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.repository.UserRepository;
import com.siddhartha.s.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	// @Autowired
	// @Qualifier("sessionFactory")
	// public SessionFactory sessionFactory;

	@Override
	public UserEntity getEmployeeById(Long id) {

		Optional<UserEntity> user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();

		} else {
			throw new SiddharthException(Constant.USER_NOT_FOUND);
		}

	}

	@Override
	public UserEntity createOrUpdateEmployee(UserEntity employee) {

		if (employee.getId() != null) {
			Optional<UserEntity> user = userRepository.findById(employee.getId());
			if (user.isPresent()) {

				UserEntity newUser = user.get();
				newUser.setFirstName(employee.getFirstName());
				newUser.setLastName(employee.getLastName());
				newUser.setEmail(employee.getEmail());
				newUser.setMobileNo(employee.getMobileNo());
				newUser = userRepository.save(newUser);
				return newUser;
			}

		}

		return userRepository.save(employee);
	}

	@Override
	public UserEntity getEmployeeByEmailId(String emailId) throws SiddharthException {
		UserEntity user = userRepository.findUserByEmail(emailId);
		if (user != null) {
			return user;

		} else {
			throw new SiddharthException(Constant.USER_NOT_FOUND);
		}
	}

	@Override
	public List<UserEntity> getALlEmployee() {

		// List<UserEntity> listOfEmpleyee = null;

		return userRepository.findAll();
	}

	@Override
	public String deleteEmployeeById(String id) throws SiddharthException {
		if (id != null) {
			Optional<UserEntity> user = userRepository.findById(Long.valueOf(id));
			if (user.isPresent()) {
				userRepository.deleteById(Long.parseLong(id));
				return Constant.SUCCESS;

			}

		}
		return Constant.ERROR;

	}

}
