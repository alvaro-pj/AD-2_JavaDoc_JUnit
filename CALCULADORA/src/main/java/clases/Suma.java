package clases;

/**
 * La clase {@code Suma} proporciona métodos para realizar operaciones de suma,
 * incluyendo la suma de números reales, enteros, la suma de tres números reales
 * y mantener un valor acumulado.
 *
 * <p>Esta clase ofrece las siguientes funcionalidades:</p>
 * <ul>
 *   <li>Suma de dos números reales</li>
 *   <li>Suma de dos números enteros</li>
 *   <li>Suma de tres números reales</li>
 *   <li>Suma de valores mediante un acumulador</li>
 * </ul>
 *
 * @author Alexander Roman Diaz
 */
public class Suma {

    /**
     * Variable que almacena el valor acumulado de las sumas realizadas.
     */
    private double acumulado = 0;

    /**
     * Suma dos números reales.
     *
     * @param fac1 Primer número real a sumar.
     * @param fac2 Segundo número real a sumar.
     * @return El resultado de la suma de los dos números reales.
     */
    public double sumaReales(double fac1, double fac2) {
        return fac1 + fac2;
    }

    /**
     * Suma dos números enteros.
     *
     * @param fac1 Primer número entero a sumar.
     * @param fac2 Segundo número entero a sumar.
     * @return El resultado de la suma de los dos números enteros.
     */
    public int sumaEnteros(int fac1, int fac2) {
        return fac1 + fac2;
    }

    /**
     * Suma tres números reales.
     *
     * @param fac1 Primer número real a sumar.
     * @param fac2 Segundo número real a sumar.
     * @param fac3 Tercer número real a sumar.
     * @return El resultado de la suma de los tres números reales.
     */
    public double sumaTresReales(double fac1, double fac2, double fac3) {
        return fac1 + fac2 + fac3;
    }

    /**
     * Realiza una suma acumulada al valor almacenado en la variable {@code acumulado}.
     *
     * @param valor El valor a sumar al acumulado.
     */
    public void sumaAcumulada(double valor) {
        acumulado += valor;
    }

    /**
     * Obtiene el valor acumulado.
     *
     * @return El valor actual acumulado.
     */
    public double getAcumulado() {
        return acumulado;
    }
}