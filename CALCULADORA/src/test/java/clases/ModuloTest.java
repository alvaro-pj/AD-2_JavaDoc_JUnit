package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Clase de operaciones de ModuloTest:
 * La clase {@code ModuloTest}  Clase que proporciona operaciones relacionadas
 * con el módulo (residuo de una división) y el valor absoluto.
 *
 * @author Jesús Pastor Ricoy (jesus.pastor318@comunidadunir.net)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */


public class ModuloTest {

    @Test
    public void testModulo() {
        assertEquals(1, Modulo.modulo(10, 3));
        assertEquals(0, Modulo.modulo(10, 5));
        assertEquals(-3, Modulo.modulo(-8, 5));
    }

    @Test
    public void testModuloConDivisorCero() {
        int resultado = Modulo.modulo(10, 0);
        assertEquals(-1, resultado, "El divisor no puede ser 0");
    }

    @Test
    public void testAbsoluto() {
        assertEquals(5.0, Modulo.absoluto(5.0));
        assertEquals(5.0, Modulo.absoluto(-5.0));
        assertEquals(0.0, Modulo.absoluto(0.0));
    }
}
