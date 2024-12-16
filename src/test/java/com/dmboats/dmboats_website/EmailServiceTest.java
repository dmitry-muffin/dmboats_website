package com.dmboats.dmboats_website;

import com.dmboats.dmboats_website.mail_service.ContactFormDto;
import com.dmboats.dmboats_website.mail_service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmailServiceTest {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private EmailService emailService;

    @Test
    void testSendEmail() throws MessagingException {
        ContactFormDto form = new ContactFormDto();
        form.setService("Test Service");
        form.setName("John Doe");
        form.setPhone("123456789");
        form.setCity("Test City");

        MimeMessage mimeMessage = Mockito.mock(MimeMessage.class);
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

        when(mailSender.createMimeMessage()).thenReturn(mimeMessage);

        emailService.sendEmail(form);

        verify(mailSender, times(1)).send(mimeMessage);
    }
}
