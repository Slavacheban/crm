package com.example.crm.controller.mapper;

import com.example.crm.controller.dto.UserDTO;
import com.example.crm.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mappings({@Mapping(source = "entity.login", target = "login"),
            @Mapping(source = "entity.password", target = "password"),
            @Mapping(source = "entity.email", target = "email"),
            @Mapping(source = "entity.phoneNumber", target = "phoneNumber")})
    UserDTO createDTO(UserEntity entity);

    @Mappings({@Mapping(source = "dto.login", target = "login"),
            @Mapping(source = "dto.password", target = "password"),
            @Mapping(source = "dto.email", target = "email"),
            @Mapping(source = "dto.phoneNumber", target = "phoneNumber")})
    UserEntity createEntity(UserDTO dto);
}
