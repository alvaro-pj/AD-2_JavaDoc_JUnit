package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de operaciones de SumaTest:
 * La clase {@code SumaTest} proporciona métodos para testear operaciones de suma,
 * incluyendo la suma de números reales, enteros, la suma de tres números reales
 * y la suma acumulada de varios valores.
 *
 * @author Alexander Roman Diaz (alexander.roman981@comunidadunir.net)
 * URL del Repositorio GitHub: https://github.com/alvaro-pj/AD-2_JavaDoc_JUnit
 */
public class SumaTest {

    private Suma suma;

    /**
     * Configuración inicial antes de cada prueba.
     * Se crea una nueva instancia de la clase Suma.
     */
    @BeforeEach
    public void setUp() {
        suma = new Suma();
    }

    /**
     * Prueba para verificar la suma de dos números reales.
     */
    @Test
    public void testSumaReales() {
        double resultado = suma.sumaReales(5.5, 4.5);
        assertEquals(10.0, resultado, 0.0001, "La suma de los números reales es incorrecta.");
    }

    /**
     * Prueba para verificar la suma de dos números enteros.
     */
    @Test
    public void testSumaEnteros() {
        int resultado = suma.sumaEnteros(10, 5);
        assertEquals(15, resultado, "La suma de los números enteros es incorrecta.");
    }

    /**
     * Prueba para verificar la suma de tres números reales.
     */
    @Test
    public void testSumaTresReales() {
        double resultado = suma.sumaTresReales(1.0, 2.0, 3.0);
        assertEquals(6.0, resultado, 0.0001, "La suma de los tres números reales es incorrecta.");
    }

    /**
     * Prueba para verificar la suma acumulada de varios valores.
     */
    @Test
    public void testSumaAcumulada() {
        suma.sumaAcumulada(5.0);
        suma.sumaAcumulada(10.0);
        double acumulado = suma.getAcumulado();
        assertEquals(15.0, acumulado, 0.0001, "El valor acumulado no es correcto.");
    }

    /**
     * Prueba para verificar que el valor acumulado inicial sea 0.
     */
    @Test
    public void testSumaAcumuladaInicial() {
        double acumulado = suma.getAcumulado();
        assertEquals(0.0, acumulado, 0.0001, "El valor acumulado inicial debería ser 0.");
    }

    /**
     * Prueba para verificar la suma de números reales incluyendo valores negativos.
     */
    @Test
    public void testSumaRealesConNegativos() {
        double resultado = suma.sumaReales(-2.5, 5.5);
        assertEquals(3.0, resultado, 0.0001, "La suma de los números reales con negativos es incorrecta.");
    }

    /**
     * Prueba para verificar la suma de números enteros incluyendo valores negativos.
     */
    @Test
    public void testSumaEnterosConNegativos() {
        int resultado = suma.sumaEnteros(-10, 15);
        assertEquals(5, resultado, "La suma de los números enteros con negativos es incorrecta.");
    }
}
