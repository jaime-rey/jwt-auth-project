package com.jaime.jwt.backend.mappers;

import com.jaime.jwt.backend.dtos.SignUpDto;
import com.jaime.jwt.backend.dtos.UserDto;
import com.jaime.jwt.backend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Repository;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
