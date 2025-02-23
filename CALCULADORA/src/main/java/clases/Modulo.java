package clases;
/**
 * La clase {@code Modulo} Clase que proporciona operaciones relacionadas
 * con el módulo (residuo de una división) y el valor absoluto.
 *  <p>Esta clase ofrece las siguientes funcionalidades:</p>
 *  * <ul>
 *  *   <li>Cálculo del módulo (residuo de una división entera).</li>
 *  *   <li>Cálculo del valor absoluto de un número.</li>
 *  * </ul>
 * @author Jesús Pastor Ricoy(jesus.pastor318@comunidadunir.net)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */
public class Modulo {

    /**
     * Calcula el residuo de la división entera de dos números.
     *
     * @param a el dividendo
     * @param b el divisor (debe ser distinto de cero)
     * @return el residuo de la división de a entre b
     */
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("El divisor no pueder ser igual a 0");
            return -1;
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



