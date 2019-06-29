package com.siddhartha.s.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.siddhartha.s.entity.UserEntity;
import com.siddhartha.s.model.AddressModel;
import com.siddhartha.s.model.UserModel;
import com.siddhartha.s.repository.UserRepository;
import com.siddhartha.s.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
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
		List<UserEntity> userEntityList = userRepository.findAll();

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

		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		// UserEntity userEntity = UserMapper.INSTANCE.userModelTouserEntity(user);
		// userEntity(user);

		UserEntity entity = userRepository.save(userEntity(user));

		session.save(entity);
		System.out.println("Sesstion:" + entity);
		session.getTransaction().commit();
		return entity;
	}

	private UserEntity userEntity(UserModel user) {

		UserEntity entity = new UserEntity();
		// entity.setAddressEntity();
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setEmail(user.getEmail());
		entity.setMobileNo(user.getMobileNo());
		entity.setUser_id(user.getUser_id());

		return entity;
	}

}
