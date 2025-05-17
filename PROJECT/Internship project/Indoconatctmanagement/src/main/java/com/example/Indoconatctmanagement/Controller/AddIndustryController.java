package com.example.Indoconatctmanagement.Controller;

import com.example.Indoconatctmanagement.model.AddIndustry;
import com.example.Indoconatctmanagement.repository.AddIndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/human")
public class AddIndustryController {

    @Autowired
    private AddIndustryRepository repository;

    // Change this path as needed; it must exist and be writable
    private final String uploadDir = "D:/industry_uploads";

    // === Handle form submission and save industry data ===
    @PostMapping("/save")
    public String saveAddIndustry(@ModelAttribute AddIndustry addIndustry,
            @RequestParam("industryImage") MultipartFile file,
            Model model) {
        try {
            // Ensure directory exists
            File uploadPath = new File(uploadDir);
            if (!uploadPath.exists()) {
                uploadPath.mkdirs();
            }

            // Generate unique file name
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, fileName);
            file.transferTo(filePath);

            // Set the file path in the entity
            addIndustry.setIndustryImagePath(fileName);
            repository.save(addIndustry);

            model.addAttribute("message", "Industry saved successfully!");

        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "File upload failed: " + e.getMessage());
        }

        return "redirect:/human/list";
    }

    // === Display all industries ===
    @GetMapping("/list")
    public String listIndustries(Model model) {
        List<AddIndustry> industries = repository.findAll();
        model.addAttribute("industries", industries);
        return "industry_list"; // You need to create this HTML view
    }

    @GetMapping("/create")
    public String createIndustryForm(Model model) {
        model.addAttribute("addIndustry", new AddIndustry()); // ✅ this line is required
        return "add_industry"; // assuming the template name is add_industry.html
    }

    // === Delete an industry by ID ===
    @GetMapping("/delete/{id}")
    public String deleteIndustry(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/human/list";
    }
}
