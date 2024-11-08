package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class NewsController {

    @GetMapping("/news")
    public String news(Model model) {
        return "news";
    }

}