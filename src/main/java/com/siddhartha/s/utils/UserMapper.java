package com.siddhartha.s.utils;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

//@Mapper(uses = {}, componentModel = "spring")
//@Mapper
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	// public User userToLoginTDO(LoginDTO dto);

	// public List<User> listusertologinTDO(List<LoginDTO> dtolist);

	// @Mapping(source = "person.description", target = "description")
	// @Mapping(source = "address.houseNo", target = "houseNumber")

	/*
	 * Convert UserEntityToUserModel
	 */

	// @Mapping(source = "addressEntity", target = "addressModel")
	// public UserModel userEntityToUserModel(UserEntity userEntity);

	/*
	 * UserModelToUserEntity
	 */

	// @Mapping(source = "addressModel", target = "addressEntity")
	// public UserEntity userModelTouserEntity(UserModel userModel);

	// @Mapping(source = "addressEntity", target = "addressModel")

	// @Mappings({ @Mapping(source = "addressEntity", target = "addressModel") })
	// public List<UserModel> listUserEntityToUserModel(UserEntity userEntity);

	// public AddressModel addressEntityToAddressModel(AddressEntity addressEntity);

}
