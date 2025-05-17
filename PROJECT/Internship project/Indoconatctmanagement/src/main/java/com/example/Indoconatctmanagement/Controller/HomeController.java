package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/Home") // use lowercase path recommended
    public String home() {
        return "HOME"; // This refers to src/main/resources/templates/HOME.html
    }

    @GetMapping("/addindustry")
    public String addIndustryPage() {
        return "add_industry";

    }

}
