package com.dmboats.dmboats_website.mail_service;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class
ContactFormDto {

    // Поле услуги (обязательно)
    @NotBlank(message = "Услуга обязательна")
    private String service;

    // Поле имени (обязательно)
    @NotBlank(message = "Имя обязательно")
    private String name;

    // Поле телефона (не обязательно)
    private String phone;

    private String email;

    // Поле города (не обязательно)
    private String city;
}
