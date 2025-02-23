package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de operaciones de CocienteTest:
 * La clase {@code CocienteTest} proporciona métodos para testear operaciones de cociente,
 * incluyendo el cociente de dos reales, el cociente de dos enteros, el inverso y la raizcuadrada

 *
 * @author Azucena Jiménez Castaneda (azucena.jimenez922@comunidadunir.net)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */

public class CocienteTest {
    private Cociente cociente;
    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }

    @Test
    void testCocienteDosReales() {
        double resultado = cociente.dividorReales(2.0, 2.0);
        assertEquals(1.0, resultado, "El cociente entre dos reales es incorrecto");
    }

    @Test
    void testCocienteDosReales0() {
        double resultado = cociente.dividorReales(2.0, 0);
        assertEquals(-1, resultado, "Dividendo no puede ser 0");
    }


    @Test
    void testCocienteDosEnteros() {
        int resultado = cociente.dividorEnteros(2, 2);
        assertEquals(1.0, resultado, "El cociente entre dos reales es incorrecto");
    }

    @Test
    void testCocienteEnteros0() {
        int resultado = cociente.dividorEnteros(2, 0);
        assertEquals(-1, resultado, "Dividendo no puede ser 0");
    }




    @Test
    void testInversoReal() {
        double resultado = cociente.inversoReal(2.0);
        assertEquals(0.5, resultado, "El cociente entre dos reales es incorrecto");
    }

    @Test
    void testInversoReal0() {
        double resultado = cociente.inversoReal(0);
        assertEquals(-1, resultado, "Dividendo no puede ser 0");
    }


    @Test
    void testRaiz() {
        double resultado = cociente.raiz(25.0);
        assertEquals(5.0, resultado, "La raiz de un numero real es incorrecta");
    }

    @Test
    void testRaizNegativo() {
        double resultado = cociente.raiz(-5);
        assertEquals(-1, resultado, "La raiz no puede ser negativa");
    }


}
