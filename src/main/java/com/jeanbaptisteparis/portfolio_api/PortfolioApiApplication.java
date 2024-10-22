package com.jeanbaptisteparis.portfolio_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jeanbaptisteparis.portfolio_api.database.DatabaseConnection;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class PortfolioApiApplication implements CommandLineRunner {

	// Charger les variables d'environnement à partir du fichier .env
	private final Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        // Démarre l'application Spring Boot
        SpringApplication.run(PortfolioApiApplication.class, args);
        
		// Essaie d'établir une connexion à la base de données
		DatabaseConnection.getConnection();
    }

    // Logger
    @Override
    public void run(String... args) throws Exception {
        System.out.println(dotenv.get("DB_URL"));
    }
}
