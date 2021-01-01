package com.asusoftware.carrent.service.impl;

import com.asusoftware.carrent.exception.UserNotFoundException;
import com.asusoftware.carrent.model.User;
import com.asusoftware.carrent.model.dto.CreateUserDto;
import com.asusoftware.carrent.model.dto.UpdateUserDto;
import com.asusoftware.carrent.repository.UserRepository;
import com.asusoftware.carrent.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
        userRepository.save(createUser(createUserDto));
    }

    @Override
    public void update(UUID id, UpdateUserDto updateUserDto) {
        User user = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        user.setFirstName(updateUserDto.getFirstName());
        user.setLastName(updateUserDto.getLastName());
        user.setEmail(updateUserDto.getEmail());
        user.setPhone(updateUserDto.getPhone());
        user.setAddress(updateUserDto.getAddress().toAddress());
        userRepository.save(user);
    }

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    private User createUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setBirthday(createUserDto.getBirthday());
        user.setPassword(createUserDto.getPassword());
        user.setPhone(createUserDto.getPhone());
        user.setPaymentInfo(createUserDto.getPaymentInfo());
        user.setAddress(createUserDto.getAddress().toAddress());
        return user;
    }
}
