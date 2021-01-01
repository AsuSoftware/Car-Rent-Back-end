package com.asusoftware.carrent.repository;

import com.asusoftware.carrent.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * car-rent Created by Antonio on 1/1/2021
 */

@Repository
public interface ImageRepository extends JpaRepository<Image, UUID> {
}
