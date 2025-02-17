package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    private Resta resta;

    @BeforeEach
    void setUp() {
        // Inicializa una nueva instancia de Resta antes de cada prueba
        resta = new Resta();
    }

    @Test
    void testRestaReales() {
        // Prueba de resta con números reales
        double resultado = resta.restaReales(5.5, 2.3);
        assertEquals(3.2, resultado, 0.0001, "La resta de 5.5 y 2.3 debería ser 3.2");
    }

    @Test
    void testRestaEnteros() {
        // Prueba de resta con números enteros
        int resultado = resta.restaEnteros(10, 3);
        assertEquals(7, resultado, "La resta de 10 y 3 debería ser 7");
    }

    @Test
    void testRestaEnterosExcepcion() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            resta.restaEnteros(2, 5);
        });
        assertEquals("El resultado debe ser un número entero.", exception.getMessage());
    }

    @Test
    void testRestaTresReales() {
        // Prueba de resta con tres números reales
        double resultado = resta.restaTresReales(10.0, 4.0, 2.0);
        assertEquals(4.0, resultado, 0.0001, "La resta de 10.0, 4.0 y 2.0 debería ser 4.0");
    }

    @Test
    void testRestaAcumulada() {
        // Prueba de acumulación y resta acumulada
        resta.restaAcumulada(5.0);
        assertEquals(-5.0, resta.getAcumulado(), 0.0001, "El valor acumulado debería ser -5.0");

        resta.restaAcumulada(3.0);
        assertEquals(-8.0, resta.getAcumulado(), 0.0001, "El valor acumulado debería ser -8.0");
    }

    @Test
    void testRestaAcumuladaSinValores() {
        // Prueba de que el valor inicial acumulado es 0
        assertEquals(0.0, resta.getAcumulado(), 0.0001, "El valor acumulado debería ser 0 inicialmente");
    }
}
