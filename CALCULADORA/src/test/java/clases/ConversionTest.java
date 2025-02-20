package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversionTest {

    private Conversion conversion;

    @BeforeEach
    void setUp() {
        conversion = new Conversion();
    }

    @Test
    void testCelsiusAFahrenheit() {
        assertEquals(32.0,conversion.celsiusAFahrenheit(0), 0.01);
        assertEquals(212.0, conversion.celsiusAFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitACelsius() {
        assertEquals(0.0, conversion.fahrenheitACelsius(32), 0.01);
        assertEquals(100.0, conversion.fahrenheitACelsius(212), 0.01);
    }

    @Test
    void testGradosARadianes() {
        assertEquals(Math.PI, conversion.gradosARadianes(180), 0.01);
        assertEquals(0, conversion.gradosARadianes(0), 0.01);
    }

    @Test
    void testRadianesAGrados() {
        assertEquals(180, conversion.radianesAGrados(Math.PI), 0.01);
        assertEquals(0, conversion.radianesAGrados(0), 0.01);
    }
}