package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Viking_4_1_Controller {
    @GetMapping("/viking_4_1")
    public String viking_4_1(Model model) {
        return "viking_4_1";
    }
}
