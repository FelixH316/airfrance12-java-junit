import org.example.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar(){
        int resultado = calculadora.sumar(5, 6);
        assertEquals(11, resultado);
    }

    @Test
    public void testDividir(){
        float resultado = calculadora.dividir(5, 2);
        float resultado2 = calculadora.dividir(10, 2);
        float resultado3 = calculadora.dividir(4, 0);
        assertEquals(2.5, resultado);
        assertEquals(5, resultado2);
        assertEquals(0, resultado3);
    }
}
