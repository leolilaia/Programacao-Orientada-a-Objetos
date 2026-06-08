
import org.junit.jupiter.api.Test;

import Model.Autor;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);

        assertEquals("Inglês", autor.getNacionalidade());
        assertEquals("Alan Turing", autor.getNome());
        assertFalse(autor.isEhUsuario());
    }

    @Test
    public void testObrasPublicadasIniciais() {
        Autor autor = new Autor("Jess", "Brasileira", false);

        assertNull(autor.getObrasPublicadas());
    }

    @Test 
    public void testObrasPublicadasPorGenero() {
        Autor autor = new Autor("Jess", "Brasileira", false);

        assertNull(autor.getObrasPublicadasPorGenero("Tecnologia")); 
    }

    @Test
    public void testCriacaoAutorComoUsuario() {
        Autor autorUsuario = new Autor("Lucas Rafael", "Brasileira", true);
        
        assertEquals("Lucas Rafael", autorUsuario.getNome());
        assertTrue(autorUsuario.isEhUsuario());
    }
}
