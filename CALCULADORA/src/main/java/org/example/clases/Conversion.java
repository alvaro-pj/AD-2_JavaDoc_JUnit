package org.example.clases;

/**
 * La clase {@code conversión} proporciona métodos para realizar operaciones de conversión de unidades,
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
 * @author Héctor González Méndez
 */

public class Conversion {

    /**
     * Convierte una temperatura de grados Celsius a Fahrenheit.
     *
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura convertida en grados Fahrenheit.
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte una temperatura de grados Fahrenheit a Celsius.
     *
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura convertida en grados Celsius.
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Convierte un ángulo de grados a radianes.
     *
     * @param grados Ángulo en grados.
     * @return Ángulo convertido en radianes.
     */
    public static double gradosARadianes(double grados) {
        return grados * Math.PI / 180;
    }

    /**
     * Convierte un ángulo de radianes a grados.
     *
     * @param radianes Ángulo en radianes.
     * @return Ángulo convertido en grados.
     */
    public static double radianesAGrados(double radianes) {
        return radianes * 180 / Math.PI;
    }
}
