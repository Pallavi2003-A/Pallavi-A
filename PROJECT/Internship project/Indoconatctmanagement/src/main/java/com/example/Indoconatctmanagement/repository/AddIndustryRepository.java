package com.example.Indoconatctmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Indoconatctmanagement.model.AddIndustry;

@Repository
public interface AddIndustryRepository extends JpaRepository<AddIndustry, Long> {
}
