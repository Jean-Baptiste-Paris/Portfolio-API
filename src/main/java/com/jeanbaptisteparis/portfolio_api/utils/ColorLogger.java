package com.jeanbaptisteparis.portfolio_api.utils;

public class ColorLogger {

    // Codes ANSI pour les couleurs
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Codes ANSI pour les couleurs brillantes
    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    // Méthodes de log pour différents niveaux avec couleurs
    public static void info(String message) {
        logWithColor(GREEN, "[INFO]", message);
    }

    public static void error(String message) {
        logWithColor(RED, "[ERROR]", message);
    }

    public static void warning(String message) {
        logWithColor(YELLOW, "[WARNING]", message);
    }

    public static void debug(String message) {
        logWithColor(BRIGHT_BLUE, "[DEBUG]", message);
    }

    // Méthode privée pour afficher un message avec une couleur et le reset
    private static void logWithColor(String color, String tag, String message) {
        System.out.println(color + tag + " " + message + RESET);
    }

    // Méthode personnalisée pour ajouter une couleur manuellement
    public static void logCustomColor(String color, String message) {
        System.out.println(color + message + RESET);
    }
}
