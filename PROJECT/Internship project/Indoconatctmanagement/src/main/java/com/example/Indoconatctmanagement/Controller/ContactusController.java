package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactusController {

    @GetMapping("/contactus")
    public String showContactPage() {
        return "contact_us"; // This loads contact_us.html from /templates
    }
}