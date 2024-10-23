package com.jeanbaptisteparis.portfolio_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanbaptisteparis.portfolio_api.entity.Email;
import com.jeanbaptisteparis.portfolio_api.repository.EmailRepository;

@Service
public class EmailService {

    @Autowired
    private EmailRepository emailRepository;
    
    public void saveEmail(Email email) {
        emailRepository.save(email);
    }
}
