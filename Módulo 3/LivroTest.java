import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testCriacaoEGettersDoLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertEquals("Java Basico", livro1.getTitulo());
        assertTrue(livro1.isDisponivel());

        assertEquals("Java Avançado", livro2.getTitulo());
        assertFalse(livro2.isDisponivel());
    }
}