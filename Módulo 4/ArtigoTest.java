package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testCriacaoArtigo() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
        assertEquals(autor, artigo.getAutor());
    }
    
    @Test
    public void testMetodoPublicar() {
        Autor autor = new Autor("Jessica", "Brasileira", false);
        Artigo artigo = new Artigo("Testes em Java", autor, "tecnologia", false);
        
        assertFalse(artigo.isPublicado());
        artigo.publicar();
        assertTrue(artigo.isPublicado());
    }
}