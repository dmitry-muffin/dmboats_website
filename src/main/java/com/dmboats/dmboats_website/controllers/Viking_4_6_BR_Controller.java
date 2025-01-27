package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Viking_4_6_BR_Controller {
    @GetMapping("/viking_4_6_br")
    public String viking_4_6_br(Model model) {
        return "viking_4_6_br";
    }
}

