package org.thingsboard.server.common.data;

public class TelemetryConverter {
    // Convertit Celsius en Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Vérifie si la donnée est valide (physiquement possible > Zéro Absolu)
    public static boolean isValidTemperature(double celsius) {
        return celsius >= -273.15;
    }
}