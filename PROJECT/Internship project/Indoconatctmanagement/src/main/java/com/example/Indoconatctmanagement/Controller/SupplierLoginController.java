package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupplierLoginController {

    @GetMapping("/supplier_login")
    public String showLoginPage() {
        return "supplier_login"; // Assumes supplier_login.html is in src/main/resources/templates/
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
            @RequestParam String password,
            Model model) {

        if ("admin".equals(username) && "password123".equals(password)) {
            return "redirect:/dashboard.html";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "supplier_login";
        }
    }
}
