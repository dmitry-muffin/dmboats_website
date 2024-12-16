package com.dmboats.dmboats_website;

import com.dmboats.dmboats_website.mail_service.ContactFormDto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContactFormDtoTest {

    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    void testValidContactForm() {
        ContactFormDto form = new ContactFormDto();
        form.setService("Test Service");
        form.setName("John Doe");

        Set<ConstraintViolation<ContactFormDto>> violations = validator.validate(form);
        assertTrue(violations.isEmpty());
    }

    @Test
    void testInvalidContactForm() {
        ContactFormDto form = new ContactFormDto();

        Set<ConstraintViolation<ContactFormDto>> violations = validator.validate(form);
        assertFalse(violations.isEmpty());
    }
}