package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        double resultado = producto.potencia(2.0,3);
        assertEquals(8,resultado,"El resultado de potencia es incorrecto");
    }

    @Test
    void testPotenciaExpCero() {
        double resultado = producto.potencia(2,0);
        assertEquals(1.0,resultado,"El resultado de potencia con exponente cero es incorrecto");
    }

    @Test
    void testPotenciaExpNegativo() {
        double resultado = producto.potencia(2.0,-2);
        assertEquals(0.25,resultado,"El resultado de potencia con exponente negativo es incorrecto");
    }
}