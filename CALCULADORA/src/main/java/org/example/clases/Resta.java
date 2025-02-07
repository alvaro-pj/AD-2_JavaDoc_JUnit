package org.example.clases;

/**
 * Clase de operaciones de Resta
 * La clase {@code Resta} proporciona métodos para realizar operaciones de resta,
 * incluyendo la resta de números reales, enteros, la resta de tres números reales
 * y mantener un valor acumulado.
 *  <p>Esta clase ofrece las siguientes funcionalidades:</p>
 *  <ul>
 *    <li>Resta de dos números reales</li>
 *    <li>Resta de dos números enteros</li>
 *    <li>Resta de tres números reales</li>
 *    <li>Acumulación de valores mediante un sistema acumulador "method"</li>
 *  </ul>
 *
 *
 * @author Iván de la Osa (ivan.delaosa214@comunidadunir.net)
 * @see Calculadora
 */
public class Resta {
    private double acumulado = 0;

    /**
     * Operación para resta de dos números reales.
     * @param num1 - Primer número real que introducirá el usuario
     * @param num2 - Primer número real que introducirá el usuario
     * @return - Resultado de la operación de resta de dos números reales.
     */
    public double restaReales(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Operación para resta de dos números enteros.
     * @param num1 - Primer número que introducirá el usuario
     * @param num2 - Primer número entero que introducirá el usuario
     * @return - Resultado de la operación de resta de dos números enteros.
     */
    public int restaEnteros(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Operación para resta de tres números reales.
     * @param num1 - Número real que introducirá el usuario.
     * @param num2 - Número real que introducirá el usuario.
     * @param num3 - Número real que introducirá el usuario.
     * @return - Resultado de la operación de resta de tres números reales.
     */
    public double restaTresReales(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Operación de resta de valores acumulados.
     * @param valor - Valores acumulados
     */
    public void restaAcumulada(double valor) {
        acumulado -= valor;
    }

    /**
     * Obtiene el valor acumulado.
     * @return El valor actual acumulado.
     */
    public double getAcumulado() {
        return acumulado;
    }

}
