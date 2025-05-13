package com.alex.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    // Custom query methods can be defined here if needed
}
