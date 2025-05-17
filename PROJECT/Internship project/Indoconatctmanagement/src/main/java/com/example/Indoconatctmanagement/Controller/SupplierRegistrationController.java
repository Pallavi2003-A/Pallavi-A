package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierRegistrationController {

    @GetMapping("/supplierregistration")
    public String showSupplierRegistrationPage() {
        return "supplierregistration"; // without .html
    }
}
