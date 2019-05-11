package com.siddhartha.s.utils;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.siddhartha.s.domain.LoginDTO;
import com.siddhartha.s.domain.User;

//@Mapper(uses = {}, componentModel = "spring")
@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	//public User userToLoginTDO(LoginDTO dto);

	//public List<User> listusertologinTDO(List<LoginDTO> dtolist);

}
