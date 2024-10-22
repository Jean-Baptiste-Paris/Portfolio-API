package com.jeanbaptisteparis.portfolio_api.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class DatabaseConnection {

    // Charger Dotenv
    private static final Dotenv dotenv = Dotenv.load();

    // Méthode pour obtenir l'URL de la BDD
    public static String getDbUrl() {
        return dotenv.get("DB_URL");
    }

    // Méthode pour obtenir l'utilisateur de la BDD
    public static String getDbUser() {
        return dotenv.get("DB_USER");
    }

    // Méthode pour obtenir le mot de passe de la BDD
    public static String getDbPassword() {
        return dotenv.get("DB_PASSWORD");
    }

    // Méthode pour établir la connexion à la BDD
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(getDbUrl(), getDbUser(), getDbPassword());
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
        return connection;
    }
}
