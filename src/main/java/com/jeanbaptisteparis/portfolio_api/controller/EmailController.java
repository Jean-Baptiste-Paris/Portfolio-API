package com.jeanbaptisteparis.portfolio_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jeanbaptisteparis.portfolio_api.entity.Email;
import com.jeanbaptisteparis.portfolio_api.service.EmailService;

@RestController
public class EmailController {
    
    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public String sendEmail(@RequestBody Email email) {
        emailService.saveEmail(email);
        return "Email enregistré avec succcès";
    }
}
