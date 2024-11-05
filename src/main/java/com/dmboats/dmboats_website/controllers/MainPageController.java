package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainPageController {

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/viking_4_6")
    public String viking_4_6(Model model) {
        return "viking_4_6";
    }


}