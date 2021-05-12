package com.example.email.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailSenderService {
    @Autowired
    private JavaMailSender emailSender;
}
