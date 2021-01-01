package com.asusoftware.carrent.service;

import com.asusoftware.carrent.model.User;
import com.asusoftware.carrent.model.dto.CreateUserDto;
import com.asusoftware.carrent.model.dto.UpdateUserDto;

import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */
public interface UserService {
    void create(CreateUserDto createUserDto);
    void update(UUID id, UpdateUserDto updateUserDto);
    User findById(UUID id);
}
