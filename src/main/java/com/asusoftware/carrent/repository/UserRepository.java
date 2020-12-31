package com.asusoftware.carrent.repository;

import com.asusoftware.carrent.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * car-rent Created by Antonio on 12/31/2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
