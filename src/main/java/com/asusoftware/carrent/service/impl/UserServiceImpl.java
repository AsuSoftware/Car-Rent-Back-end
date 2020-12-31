package com.asusoftware.carrent.service.impl;

import com.asusoftware.carrent.model.User;
import com.asusoftware.carrent.model.dto.CreateUserDto;
import com.asusoftware.carrent.repository.UserRepository;
import com.asusoftware.carrent.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    private User createUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setBirthday(createUserDto.getBirthday());
        user.setPassword(createUserDto.getPassword());
        user.setPaymentInfo(createUserDto.getPaymentInfo());
        user.setAddress(createUserDto.getAddress().toAddress());
        return user;
    }
}
