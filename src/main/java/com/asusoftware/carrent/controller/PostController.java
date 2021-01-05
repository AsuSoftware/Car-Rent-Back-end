package com.asusoftware.carrent.controller;

import com.asusoftware.carrent.model.dto.CreatePostDto;
import com.asusoftware.carrent.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/{id}")
    public void create(@PathVariable("id") UUID id, @Valid @RequestBody CreatePostDto createPostDto) {
      postService.create(id, createPostDto);
    }
}
