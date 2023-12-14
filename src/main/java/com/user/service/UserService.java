package com.user.service;

import com.user.payload.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto updateUser(UserDto user, Long id);

    void deleteUser(long id);

    UserDto getUserById(long id);

    List<UserDto> getAllUsers();
}
