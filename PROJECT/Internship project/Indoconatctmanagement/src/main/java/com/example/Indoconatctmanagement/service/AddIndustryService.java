package com.example.Indoconatctmanagement.service;

import com.example.Indoconatctmanagement.model.AddIndustry;
import com.example.Indoconatctmanagement.repository.AddIndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddIndustryService {

    @Autowired
    private AddIndustryRepository industryRepository;

    public AddIndustry saveIndustry(AddIndustry industry) {
        return industryRepository.save(industry);
    }

    public List<AddIndustry> getAllIndustries() {
        return industryRepository.findAll();
    }

    public void deleteIndustryById(Long id) {
        industryRepository.deleteById(id);
    }
}