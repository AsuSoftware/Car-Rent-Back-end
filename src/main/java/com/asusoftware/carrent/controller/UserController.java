package com.asusoftware.carrent.controller;

import com.asusoftware.carrent.model.dto.CreateUserDto;
import com.asusoftware.carrent.model.dto.UpdateUserDto;
import com.asusoftware.carrent.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/29/2020
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private UserService userService;


    @PostMapping
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }

    @PutMapping(path = "/{id}")
    public void findById(@PathVariable("id") UUID id, @Valid @RequestBody UpdateUserDto updateUserDto) {}
}
