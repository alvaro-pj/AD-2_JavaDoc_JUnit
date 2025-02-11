package org.example.clases;
/**
 * La clase {@code Modulo} Clase que proporciona operaciones relacionadas
 * con el módulo (residuo de una división) y el valor absoluto.
 *  <p>Esta clase ofrece las siguientes funcionalidades:</p>
 *  * <ul>
 *  *   <li>Cálculo del módulo (residuo de una división entera).</li>
 *  *   <li>Cálculo del valor absoluto de un número.</li>
 *  * </ul>
 * @author Jesús Pastor Ricoy
 */
public class Modulo {

    /**
     * Calcula el residuo de la división entera de dos números.
     *
     * @param a el dividendo
     * @param b el divisor (debe ser distinto de cero)
     * @return el residuo de la división de a entre b
     * @throws ArithmeticException si b es cero
     */
    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("El divisor no puede ser cero");
        }
        return a % b;
    }

    /**
     * Calcula el valor absoluto de un número.
     *
     * @param a el número de entrada
     * @return el valor absoluto de a
     */
    public static double absoluto(double a) {
        return (a >= 0) ? a : -a;
    }
}



