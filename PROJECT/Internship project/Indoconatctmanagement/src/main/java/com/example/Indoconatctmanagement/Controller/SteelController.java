package com.example.Indoconatctmanagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SteelController {

    @GetMapping("/ steel-power")
    public String home() {
        return "redirect:/steelpower.html";
    }

    @GetMapping("/steel-power")
    public String viewSteelPowerPage(Model model) {
        model.addAttribute("title", "Steel Power");
        return "steelpower"; // no .html needed
    }

}
