package com.asusoftware.carrent.service.impl;

import com.asusoftware.carrent.model.Image;
import com.asusoftware.carrent.model.Post;
import com.asusoftware.carrent.model.PostState;
import com.asusoftware.carrent.model.User;
import com.asusoftware.carrent.model.dto.CreatePostDto;
import com.asusoftware.carrent.repository.ImageRepository;
import com.asusoftware.carrent.repository.PostRepository;
import com.asusoftware.carrent.service.PostService;
import com.asusoftware.carrent.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

/**
 * car-rent Created by Antonio on 12/31/2020
 */

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ImageRepository imageRepository;
    private final UserService userService;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
      User user = userService.findById(id);
      Post post = postRepository.save(createPost(user, createPostDto));
      imageRepository.saveAll(createPostDto.getImages().stream().map(img -> createImage(img, post)).collect(Collectors.toList()));
    }

    private Post createPost(User user, CreatePostDto createPostDto) {
        Post post = new Post();
        post.setBrand(createPostDto.getBrand());
        post.setModel(createPostDto.getModel());
        post.setEngine(createPostDto.getEngine());
        post.setHp(createPostDto.getHp());
        post.setDescription(createPostDto.getDescription());
        post.setPostCategory(createPostDto.getPostCategory());
        post.setPostState(PostState.FREE);
        post.setAddress(createPostDto.getAddress().toAddress());
        post.setFabrication(createPostDto.getFabrication());
        post.setUser(user);
        return post;
    }

    private Image createImage(String value, Post post) {
        Image image = new Image();
        image.setValue(value);
        image.setPost(post);
        return image;
    }
}
