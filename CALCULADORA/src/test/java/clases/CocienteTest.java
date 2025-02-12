package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocienteTest {
    private Cociente cociente;
    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    @Test
    void testDividorReales() {
        assertEquals(3.5, Cociente.dividorReales(7.0, 2.0), 0.0001);
        assertEquals(-4.0, Cociente.dividorReales(-8.0, 2.0), 0.0001);
        assertThrows(ArithmeticException.class, () -> Cociente.dividorReales(6.0, 0.0));
    }

    @Test
    void testDividorEnteros() {
        assertEquals(3, Cociente.dividorEnteros(9, 3));
        assertEquals(-3, Cociente.dividorEnteros(-9, 3));
        assertThrows(ArithmeticException.class, () -> Cociente.dividorEnteros(7, 0));
    }

    @Test
    void testInversoReal() {
        assertEquals(0.25, Cociente.inversoReal(4.0), 0.0001);
        assertEquals(-0.2, Cociente.inversoReal(-5.0), 0.0001);
        assertThrows(ArithmeticException.class, () -> Cociente.inversoReal(0.0));
    }

    @Test
    void testRaiz() {
        assertEquals(4.0, Cociente.raiz(16.0), 0.0001);
        assertEquals(0.0, Cociente.raiz(0.0), 0.0001);
        assertThrows(ArithmeticException.class, () -> Cociente.raiz(-9.0));
    }
}
