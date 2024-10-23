package com.jeanbaptisteparis.portfolio_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeanbaptisteparis.portfolio_api.database.DatabaseConnection;

@SpringBootApplication
public class PortfolioApiApplication implements CommandLineRunner {

    @Autowired
    private DatabaseConnection databaseConnection; // Injection du DatabaseConnection

    public static void main(String[] args) {
        // Démarre l'application Spring Boot
        SpringApplication.run(PortfolioApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {        
        // Appel de la méthode pour tester la connexion à la BDD
        databaseConnection.getConnection();
    }
}
