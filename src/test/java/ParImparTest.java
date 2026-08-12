import org.example.ParImpar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParImparTest {

    @Test
    public void evenValidation(){
        ParImpar parImpar = new ParImpar();
        boolean resultado = parImpar.esPar(10);
        assertTrue(resultado);
    }

    @Test
    public void oddValidation(){
        ParImpar parImpar = new ParImpar();
        boolean resultado = parImpar.esPar(77);
        assertFalse(resultado);
    }
}
