package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DMB_Aparel_Controller {

    @GetMapping("/aparel")
    public String aparel(Model model) {
        return "aparel";
    }

}