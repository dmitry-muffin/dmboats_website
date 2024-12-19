package com.dmboats.dmboats_website.mail_service;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final EmailService emailService;

    // Обработка POST-запроса для отправки формы
    @PostMapping
    public ResponseEntity<String> sendContactForm(@Valid @RequestBody ContactFormDto contactForm) {
        // Выводим в консоль для отладки
        System.out.println("Получено услуга: " + contactForm.getService());
        System.out.println("Получено имя: " + contactForm.getName());
        System.out.println("Получен телефон: " + contactForm.getPhone());
        System.out.println("Получен email: " + contactForm.getEmail());
        System.out.println("Получен город: " + contactForm.getCity());

        // Отправляем email с данными из формы
        emailService.sendEmail(contactForm);
        return new ResponseEntity<>("Заявка успешно отправлена!", HttpStatus.OK);
    }
}
