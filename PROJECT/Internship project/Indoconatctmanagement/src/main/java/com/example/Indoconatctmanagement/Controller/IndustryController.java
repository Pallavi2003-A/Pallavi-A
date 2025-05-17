package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndustryController {

    @GetMapping("/industry-machinery")
    public String showIndustryPage() {
        return "industryMachinery"; // without `.html` extension
    }
}
