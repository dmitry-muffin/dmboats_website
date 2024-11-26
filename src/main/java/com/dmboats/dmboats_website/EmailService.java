package com.dmboats.dmboats_website;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    // Метод для отправки email
    public void sendEmail(ContactFormDto contactForm) {
        try {
            // Создание MIME-сообщения
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false, "UTF-8");

            // Установка параметров письма
            helper.setFrom("dmboats_mail_service@mail.ru"); // Адрес отправителя
            helper.setTo("andima70@gmail.com"); // Адрес получателя
            helper.setSubject("Новая заявка на лодку Viking 4.6: " + contactForm.getService()); // Тема письма

            // Установка текста письма в HTML-формате
            String messageContent = String.format(
                    "<p>Услуга: %s</p><p>Имя отправителя: %s</p><p>Телефон: %s</p><p>Город: %s</p>",
                    contactForm.getService(),
                    contactForm.getName(),
                    contactForm.getPhone() != null ? contactForm.getPhone() : "Не указан",
                    contactForm.getCity() != null ? contactForm.getCity() : "Не указан"
            );

            helper.setText(messageContent, true);

            // Отправка письма
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            throw new RuntimeException("Ошибка при отправке письма: " + e.getMessage(), e);
        }
    }
}
