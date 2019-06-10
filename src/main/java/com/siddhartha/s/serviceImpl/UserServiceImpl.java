package com.siddhartha.s.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.model.AddressModel;
import com.siddhartha.s.model.UserModel;
import com.siddhartha.s.repository.UserRepository;
import com.siddhartha.s.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * @Override public UserEntity findUserByEmail(String email) { UserEntity user =
	 * userRepository.findUserByEmail(email); return user; }
	 */

	/*
	 * @Override public UserModel saveUser(UserModel user) { return null; }
	 * 
	 * @Override public List<UserModel> listOfUser(Long id) {
	 * 
	 * List<UserModel> list = new ArrayList<>();
	 * 
	 * // list = userRepository.findAll();
	 * 
	 * return list; }
	 */
	@Override
	public List<UserModel> getList() {

		List<UserModel> userList = new ArrayList();
		List<UserEntity> userEntityList = userRepository.findAll();

		for (UserEntity userEntity : userEntityList) {

			UserModel userModel = new UserModel();

			userModel.setFirstName(userEntity.getFirstName());

			userModel.setLastName(userEntity.getLastName());
			userModel.setEmail(userEntity.getEmail());
			userModel.setMobileNo(userEntity.getMobileNo());
			userModel.setUser_id(userEntity.getUser_id());

			AddressModel addressModel = new AddressModel();

			addressModel.setCity(userEntity.getAddressEntity().getCity());

			userModel.setAddressModel(addressModel);

//			userModel.setAddressModel(UserMapper.INSTANCE.userEntityToUserModel(userEntity.getAddressEntity()));

			/// UserModel userModel = UserMapper.INSTANCE.userEntityToUserModel(userEntity);

			userList.add(userModel);
		}

		return userList;
	}

}
