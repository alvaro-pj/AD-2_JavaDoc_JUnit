package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        Exception exception = assertThrows(IllegalArgumentException.class, () -> producto.potenciaEnteros(2, -2));
        assertEquals("El exponente no puede ser negativo", exception.getMessage());
    }

    @Test
    void testPotenciaOverflow() {
        Exception exception = assertThrows(ArithmeticException.class, () -> producto.potenciaEnteros(2, 32));
        assertEquals("El resultado es demasiado grande", exception.getMessage());
    }

}