package clases;


    /**
     * Clase de operaciones de Producto
     * La clase {@code Producto} proporciona métodos para realizar el productos,
     * incluyendo el producto de números reales, enteros, el producto de tres números reales
     * y la potencia.
     *  <p>Esta clase ofrece las siguientes funcionalidades:</p>
     *  <ul>
     *    <li>Producto de dos números reales</li>
     *    <li>Producto de dos números enteros</li>
     *    <li>Producto de tres números reales</li>
     *    <li>Potencia de un numero elevado a otro</li>
     *  </ul>
     *
     *
     * @author Alvaro Postigo Jimenez (alvaro.postigo440@comunidadunir.net)
     * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
     */
    public class Producto {

        /**
         * Operación para el producto de dos números reales.
         * @param num1 - Primer número real que introducirá el usuario.
         * @param num2 - Segundo número real que introducirá el usuario.
         * @return - Resultado de la operación del producto de dos números reales.
         */
        public static double productoDosReales (double num1, double num2) {
            return num1*num2;
        }
        /**
         * Operación para el producto de dos números enteros.
         * @param num1 - Primer número entero que introducirá el usuario.
         * @param num2 - Segundo número entero que introducirá el usuario.
         * @return - Resultado de la operación del producto de dos números enteros.
         */

        public static int productoDosEnteros (int num1, int num2) {
            return num1*num2;
        }

        /**
         * Operación para el producto de tres números reales.
         * @param num1 - Número real que introducirá el usuario.
         * @param num2 - Número real que introducirá el usuario.
         * @param num3 - Número real que introducirá el usuario.
         * @return - Resultado de la operación del producto de tres numeros reales.
         */
        public static double productoTresReales (double num1, double num2, double num3) {
            return num1*num2*num3;
        }
        /**
         * Operacion para la potencia de dos numeros reales.
         * @param base - Número real que introducira el usuario.
         * @param exponente - Número real que introducira el usuario.
         * @return  Resultado de la operacion de potencia de dos numeros reales.
         */
        public static int potenciaEnteros(int base, int exponente) {
            if (exponente < 0) {
                System.out.println("Error: El exponente no puede ser negativo");
                return -1;
            }

            int resultado = 1;

            for (int i = 0; i < exponente; i++) {
                if (resultado > Integer.MAX_VALUE / base) {
                    System.out.println("Error: El resultado excede el valor máximo de un int");
                    return -1;
                }
                resultado *= base;
            }
            return resultado;


        }
}
