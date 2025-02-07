package clases;

import org.example.clases.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    private Suma suma;

    @BeforeEach
    public void setUp() {
        suma = new Suma(); // Crear una nueva instancia de Suma antes de cada test
    }

    @Test
    public void testSumaReales() {
        double resultado = suma.sumaReales(5.5, 4.5);
        assertEquals(10.0, resultado, 0.0001, "La suma de los números reales es incorrecta.");
    }

    @Test
    public void testSumaEnteros() {
        int resultado = suma.sumaEnteros(10, 5);
        assertEquals(15, resultado, "La suma de los números enteros es incorrecta.");
    }

    @Test
    public void testSumaTresReales() {
        double resultado = suma.sumaTresReales(1.0, 2.0, 3.0);
        assertEquals(6.0, resultado, 0.0001, "La suma de los tres números reales es incorrecta.");
    }

    @Test
    public void testSumaAcumulada() {
        suma.sumaAcumulada(5.0);
        suma.sumaAcumulada(10.0);
        double acumulado = suma.getAcumulado();
        assertEquals(15.0, acumulado, 0.0001, "El valor acumulado no es correcto.");
    }

    @Test
    public void testSumaAcumuladaInicial() {
        // Verificar que el valor acumulado inicial sea 0
        double acumulado = suma.getAcumulado();
        assertEquals(0.0, acumulado, 0.0001, "El valor acumulado inicial debería ser 0.");
    }

    @Test
    public void testSumaRealesConNegativos() {
        double resultado = suma.sumaReales(-2.5, 5.5);
        assertEquals(3.0, resultado, 0.0001, "La suma de los números reales con negativos es incorrecta.");
    }

    @Test
    public void testSumaEnterosConNegativos() {
        int resultado = suma.sumaEnteros(-10, 15);
        assertEquals(5, resultado, "La suma de los números enteros con negativos es incorrecta.");
    }
}

