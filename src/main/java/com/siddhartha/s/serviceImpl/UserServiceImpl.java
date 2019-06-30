package com.siddhartha.s.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siddhartha.s.entity.AddressEntity;
import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.model.AddressModel;
import com.siddhartha.s.model.UserModel;
import com.siddhartha.s.repository.UserRepository;
import com.siddhartha.s.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	// @Qualifier("userRepository")
	private UserRepository userRepository;

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

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

		List<UserModel> userList = new ArrayList<UserModel>();
		// List<UserEntity> userEntityList = userRepository.findAll();

		List<UserEntity> userEntityList = new ArrayList<>();

		for (UserEntity userEntity : userEntityList) {

			UserModel userModel = new UserModel();

			userModel.setFirstName(userEntity.getFirstName());

			userModel.setLastName(userEntity.getLastName());
			userModel.setEmail(userEntity.getEmail());
			userModel.setMobileNo(userEntity.getMobileNo());
			userModel.setUser_id(userEntity.getUser_id());

			AddressModel addressModel = new AddressModel();
			if (userEntity.getAddressEntity() != null) {
				addressModel.setCity(userEntity.getAddressEntity().getCity());

				userModel.setAddressModel(addressModel);

			}

//			userModel.setAddressModel(UserMapper.INSTANCE.userEntityToUserModel(userEntity.getAddressEntity()));

			/// UserModel userModel = UserMapper.INSTANCE.userEntityToUserModel(userEntity);

			userList.add(userModel);
		}

		return userList;
	}

	@Override
	public UserEntity saveNewUser(UserModel user) {

		UserEntity entity = userEntity(user);
		return userRepository.save(entity);
	}

	private UserEntity userEntity(UserModel user) {

		UserEntity entity = new UserEntity();
		// entity.setAddressEntity();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setEmail(user.getEmail());
		entity.setMobileNo(user.getMobileNo());
		entity.setUser_id(user.getUser_id());
		if (user.getAddressModel() != null) {
			entity.setAddressEntity(convertAddress((user.getAddressModel())));
		}

		return entity;
	}

	private AddressEntity convertAddress(AddressModel addressModel) {

		AddressEntity am = new AddressEntity();
		am.setCity(addressModel.getCity());
		am.setAddress_id(addressModel.getAddress_id());
		am.setCountry(addressModel.getCountry());
		am.setPinCode(addressModel.getPinCode());
		am.setState(addressModel.getState());
		am.setStreet(addressModel.getStreet());
		return am;
	}

}
