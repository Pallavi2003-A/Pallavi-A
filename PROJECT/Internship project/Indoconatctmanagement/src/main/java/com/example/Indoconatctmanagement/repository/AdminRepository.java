package com.example.Indoconatctmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Indoconatctmanagement.model.Admin;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
