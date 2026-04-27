import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testGetters() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21 , usuario.getIdade());
    }
    
    @Test
    public void testHistoricoEmprestimos() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertNull(usuario.getHistoricoEmprestimo());
    }
}
