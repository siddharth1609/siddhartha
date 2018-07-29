package com.siddhartha.utils;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.siddhartha.model.LoginDTO;
import com.siddhartha.model.LoginModel;

@Mapper(uses = {}, componentModel = "spring")
public interface LoginMapper {
	public LoginMapper INSTANCE = Mappers.getMapper(LoginMapper.class);

	public List<LoginModel> mapToLoginModelToLoginDTO(List<LoginDTO> loginDTOList);
}
