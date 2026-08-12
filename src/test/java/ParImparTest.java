import org.example.Calculadora;
import org.example.ParImpar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParImparTest {

    ParImpar parImparObject;

    @BeforeEach
    public void setUp(){
        parImparObject = new ParImpar();
    }

    @Test
    public void evenValidation(){
        boolean resultado = parImparObject.esPar(10);
        assertTrue(resultado);
    }

    @Test
    public void oddValidation(){
        boolean resultado = parImparObject.esPar(77);
        assertFalse(resultado);
    }
}
