package com.example.Indoconatctmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Indoconatctmanagement.service.AdminService;

@Controller
@RequestMapping("/login")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("admin", new com.example.Indoconatctmanagement.model.Admin());
        return "adminloginpage";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("admin") com.example.Indoconatctmanagement.model.Admin admin, Model model) {
        boolean success = adminService.authenticate(admin.getUsername(), admin.getPassword());
        if (success) {
            return "redirect:/dashboard"; // You should create this view
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "adminloginpage";
        }
    }
}
