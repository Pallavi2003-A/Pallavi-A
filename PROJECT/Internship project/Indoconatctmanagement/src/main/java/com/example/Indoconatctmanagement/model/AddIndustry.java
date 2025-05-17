package com.example.Indoconatctmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "add_industry")
public class AddIndustry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String industryName;
    private String industryType;
    private String industryAddress;
    private String industryCity;
    private String industryState;
    private String industryCountry;
    private String industryPhone;

    // This will store the uploaded file path or name
    private String industryImagePath;

    // === Getters and Setters ===

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getIndustryAddress() {
        return industryAddress;
    }

    public void setIndustryAddress(String industryAddress) {
        this.industryAddress = industryAddress;
    }

    public String getIndustryCity() {
        return industryCity;
    }

    public void setIndustryCity(String industryCity) {
        this.industryCity = industryCity;
    }

    public String getIndustryState() {
        return industryState;
    }

    public void setIndustryState(String industryState) {
        this.industryState = industryState;
    }

    public String getIndustryCountry() {
        return industryCountry;
    }

    public void setIndustryCountry(String industryCountry) {
        this.industryCountry = industryCountry;
    }

    public String getIndustryPhone() {
        return industryPhone;
    }

    public void setIndustryPhone(String industryPhone) {
        this.industryPhone = industryPhone;
    }

    public String getIndustryImagePath() {
        return industryImagePath;
    }

    public void setIndustryImagePath(String industryImagePath) {
        this.industryImagePath = industryImagePath;
    }
}
