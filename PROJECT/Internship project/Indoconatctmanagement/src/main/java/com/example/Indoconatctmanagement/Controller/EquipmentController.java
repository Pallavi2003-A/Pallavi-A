package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class EquipmentController {

    @GetMapping("/construction-equipment")
    public String equipmentPage(Model model) {
        // Add attributes to model if needed
        return "constructionequipment"; // no .html extension
    }
}
