package com.jeanbaptisteparis.portfolio_api.repository;

import com.jeanbaptisteparis.portfolio_api.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    
}