import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês");

        assertEquals("Inglês", autor.getNacionalidade());
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    public void testObrasPublicadasIniciais() {
        Autor autor = new Autor("Jess", "Brasileira");

        assertNull(autor.getObrasPublicadas());
    }

    @Test 
    public void testObrasPublicadasPorGenero() {
        Autor autor = new Autor("Jess", "Brasileira");

        assertNull(autor.getObrasPublicadasPorGenero("Tecnologia")); 
    }
}
