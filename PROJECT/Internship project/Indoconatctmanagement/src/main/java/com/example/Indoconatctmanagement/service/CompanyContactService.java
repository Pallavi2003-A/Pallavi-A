package com.example.Indoconatctmanagement.service;

import com.example.Indoconatctmanagement.model.CompanyContact;
import com.example.Indoconatctmanagement.repository.CompanyContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyContactService {

    private final CompanyContactRepository repository;

    @Autowired
    public CompanyContactService(CompanyContactRepository repository) {
        this.repository = repository;
    }

    public CompanyContact saveContact(CompanyContact contact) {
        return repository.save(contact);
    }

    public List<CompanyContact> getAllContacts() {
        return repository.findAll();

    }

}
