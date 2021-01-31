package com.ohhaithere.eatery.mapper;

import com.ohhaithere.eatery.dto.UserDto;
import com.ohhaithere.eatery.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);
    User toEntity(UserDto userDto);

}
