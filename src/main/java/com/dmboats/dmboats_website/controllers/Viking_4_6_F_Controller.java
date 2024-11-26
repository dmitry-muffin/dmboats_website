package com.dmboats.dmboats_website.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.dmboats.dmboats_website.ContactFormDto;
import com.dmboats.dmboats_website.EmailService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Controller
public class Viking_4_6_F_Controller {
    @GetMapping("/viking_4_6_f")
    public String viking_4_6_f(Model model) {
        return "viking_4_6_f";
    }
}

