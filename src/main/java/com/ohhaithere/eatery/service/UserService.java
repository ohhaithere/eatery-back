package com.ohhaithere.eatery.service;

import com.ohhaithere.eatery.dto.UserDto;
import com.ohhaithere.eatery.mapper.UserMapper;
import com.ohhaithere.eatery.model.User;
import com.ohhaithere.eatery.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        user.setId(UUID.randomUUID());
        return userMapper.toDto(userRepository.save(user));
    }

    public List<UserDto> getAllUsers() {
       return userRepository.findAll().stream()
               .map(userMapper::toDto)
               .collect(Collectors.toList());
    }

}
