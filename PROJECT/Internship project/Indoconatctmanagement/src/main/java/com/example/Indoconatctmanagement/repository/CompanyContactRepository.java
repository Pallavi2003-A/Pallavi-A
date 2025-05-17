package com.example.Indoconatctmanagement.repository;

import com.example.Indoconatctmanagement.model.CompanyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyContactRepository extends JpaRepository<CompanyContact, Long> {
}
