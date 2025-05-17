package com.example.Indoconatctmanagement.Controller;

import com.example.Indoconatctmanagement.model.CompanyContact;
import com.example.Indoconatctmanagement.service.CompanyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CompanyContactController {

    private final CompanyContactService contactService;

    @Autowired
    public CompanyContactController(CompanyContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/buyers") // Correct mapping
    public String viewBuyers(Model model) {
        model.addAttribute("companies", contactService.getAllContacts());
        return "buyers";
    }

    // Display the contact form (add.html)
    @GetMapping("/contact-form")
    public String showForm(Model model) {
        model.addAttribute("company", new CompanyContact());
        return "add";
    }

    // Handle form submission and redirect to buyers
    @PostMapping("/submitCompany")
    public String handleSubmit(
            @ModelAttribute("company") CompanyContact company,
            @RequestParam(required = false) String contactMethod) {

        if (contactMethod != null) {
            company.setContactMethod(contactMethod);
        } else {
            company.setContactMethod("submitted");
        }

        contactService.saveContact(company);
        return "redirect:/buyers";
    }

    // Optional: View all in submissions.html
    @GetMapping("/submissions")
    public String viewSubmissions(Model model) {
        model.addAttribute("submissions", contactService.getAllContacts());
        return "submissions";
    }
}
