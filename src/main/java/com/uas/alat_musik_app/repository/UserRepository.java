package com.uas.alat_musik_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uas.alat_musik_app.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}