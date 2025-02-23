package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de operaciones de Conversiontest:
 * La clase {@code ConversionTest} proporciona métodos para testear operaciones de conversion,
 * incluyendo la conversión de Celsius a Fahrenheit, de Farenheit a Celsius, grados a radianes
 * y radianes a grados.
 *
 * <p>Esta clase ofrece las siguientes funcionalidades:</p>
 * <ul>
 *   <li>Conversión de grados Celsius a Fahrenheit</li>
 *   <li>Conversión de grados Fahrenheit a Celsius</li>
 *   <li>Conversión de grados a radianes</li>
 *   <li>Conversión de radianes a grados</li>
 * </ul>
 *
 * @author Héctor González Méndez (hectorgomendez@gmail.com)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */

class ConversionTest {

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