package org.thingsboard.server.common.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelemetryConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        // Test standard : 0°C = 32°F
        Assertions.assertEquals(32.0, TelemetryConverter.celsiusToFahrenheit(0), 0.001);
        // Test standard : 100°C = 212°F
        Assertions.assertEquals(212.0, TelemetryConverter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    public void testValidation() {
        // Une température valide (25°C)
        Assertions.assertTrue(TelemetryConverter.isValidTemperature(25.0));
        // Une température impossible (-300°C) doit retourner faux
        Assertions.assertFalse(TelemetryConverter.isValidTemperature(-300.0));
    }
}