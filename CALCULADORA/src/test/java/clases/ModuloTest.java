package clases;

import org.example.clases.Modulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ModuloTest {

    private Modulo modulo;

    @BeforeEach
    void setUp() {
        // Inicializa una nueva instancia de Resta antes de cada prueba
        modulo = new Modulo();
    }

    @Test
    public void testModulo() {
        assertEquals(1, modulo.modulo(10, 3));
        assertEquals(0, modulo.modulo(10, 5));
        assertEquals(2, modulo.modulo(-8, 5));
    }

    @Test
    public void testModuloConDivisorCero() {
        assertThrows(ArithmeticException.class, () -> modulo.modulo(10, 0));
    }

    @Test
    public void testAbsoluto() {
        assertEquals(5.0, modulo.absoluto(5.0));
        assertEquals(5.0, modulo.absoluto(-5.0));
        assertEquals(0.0, modulo.absoluto(0.0));
    }
}
