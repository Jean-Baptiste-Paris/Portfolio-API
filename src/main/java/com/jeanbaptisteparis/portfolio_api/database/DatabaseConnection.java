package com.jeanbaptisteparis.portfolio_api.database;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jeanbaptisteparis.portfolio_api.utils.ColorLogger;

@Component
public class DatabaseConnection {

    @Autowired
    private DataSource dataSource;

    // Méthode pour établir la connexion à la BDD
    public Connection getConnection() throws SQLException {
        ColorLogger.debug("Tentative de connexion à " + System.getenv("DB_URL"));
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            ColorLogger.debug("Connection successful!");
        } catch (SQLException e) {
            ColorLogger.debug("Connection failed: " + e.getMessage());
            throw e;
        }
        return connection;
    }
}
