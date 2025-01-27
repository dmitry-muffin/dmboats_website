package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AMRL_Controller {
    @GetMapping("/viking_amrl")
    public String viking_amrl(Model model) {
        return "viking_amrl";
    }
}

