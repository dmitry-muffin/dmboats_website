package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ARRL_Controller {
    @GetMapping("/viking_arrl")
    public String viking_arrl(Model model) {
        return "viking_arrl";
    }
}

