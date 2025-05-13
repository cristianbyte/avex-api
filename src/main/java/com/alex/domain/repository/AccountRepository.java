package com.alex.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alex.domain.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {
    // Custom query methods can be defined here if needed
}
