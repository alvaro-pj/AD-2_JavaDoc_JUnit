package clases;

import org.example.clases.Producto;
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
    void testProductoDosEnteros() {
        double resultado = producto.productoDosEnteros(2,2);
        assertEquals(4,resultado,"El prodcuto de dos enteros es incorrecto");
    }

    @Test
    void testProductoTresReales() {
        double resultado = producto.productoTresReales(2.5,2.5,3.5);
        assertEquals(21.875,resultado,"El prodcuto de tres reales es incorrecto");
    }

    @Test
    void testPotencia() {
        double resultado = producto.potencia(2,3);
        assertEquals(8,resultado,"El resultado de potencia es incorrecto");
    }
}