package com.asusoftware.carrent.service;

import com.asusoftware.carrent.model.dto.CreatePostDto;

import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */
public interface PostService {
    void create(UUID id, CreatePostDto createPostDto);
}
