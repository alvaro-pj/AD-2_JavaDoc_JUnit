package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Clase de operaciones de ProductoTest:
 * La clase {@code ProductoTest} proporciona métodos para testear operaciones de prducto,
 * incluyendo el producto de dos reales, el prodcuto de dos enteros, el producto de tres números reales
 * y la potencia de dos enteros.
 *
 * @author Álvaro Postigo Jiménez (alvaro.postigo440@comunidadunir.net)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */

public class ProductoTest {
private Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    void testProductoDosReales() {
        double resultado = producto.productoDosReales(2.5,2.5);
        assertEquals(6.25,resultado,"El prodcuto de dos reales es incorrecto");
    }

    @Test
    void testProductoDosRealesNegativo() {
        double resultado = producto.productoDosReales(-2.0,2.0);
        assertEquals(-4.0,resultado,"El prodcuto de dos reales con un numero negativo es incorrecto");
    }

    @Test
    void testProductoDosRealesCero() {
        double resultado = producto.productoDosReales(0,2.5);
        assertEquals(0,resultado,"El prodcuto de dos reales con cero es incorrecto");
    }

    @Test
    void testProductoDosEnteros() {
        int resultado = producto.productoDosEnteros(2,2);
        assertEquals(4,resultado,"El prodcuto de dos enteros es incorrecto");
    }

    @Test
    void testProductoDosEnterosNegativo() {
        int resultado = producto.productoDosEnteros(-2,2);
        assertEquals(-4,resultado,"El prodcuto de dos enteros con un numero negativo es incorrecto");
    }

    @Test
    void testProductoDosEnterosCero() {
        int resultado = producto.productoDosEnteros(0,2);
        assertEquals(0,resultado,"El prodcuto de dos enteros con cero es incorrecto");
    }

    @Test
    void testProductoTresReales() {
        double resultado = producto.productoTresReales(2.5,2.5,3.5);
        assertEquals(21.875,resultado,"El prodcuto de tres reales es incorrecto");
    }

    @Test
    void testProductoTresRealesNegativo() {
        double resultado = producto.productoTresReales(-1.0,2.0,3.0);
        assertEquals(-6.0,resultado,"El prodcuto de tres reales con un numero negativo es incorrecto");
    }

    @Test
    void testProductoTresRealesCero() {
        double resultado = producto.productoTresReales(0,2.5,3.5);
        assertEquals(0,resultado,"El prodcuto de tres reales con cero es incorrecto");
    }

    @Test
    void testPotencia() {
        int resultado = producto.potenciaEnteros(2, 3);
        assertEquals(8, resultado, "El resultado de potencia es incorrecto");
    }

    @Test
    void testPotenciaExpCero() {
        int resultado = producto.potenciaEnteros(2, 0);
        assertEquals(1, resultado, "El resultado de potencia con exponente cero es incorrecto");
    }

    @Test
    void testPotenciaExpNegativo() {
        int resultado = producto.potenciaEnteros(3, -2);
        assertEquals(-1, resultado, "El resultado de potencia con exponente negativo debería ser -1");
    }

    @Test
    void testPotenciaOverflow() {
        int resultado = producto.potenciaEnteros(2, 31);
        assertEquals(-1, resultado, "El resultado de potencia que excede Integer.MAX_VALUE debería ser -1");
    }

}