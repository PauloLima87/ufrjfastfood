import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.Sanduiche;
import br.ufrj.dcc.so20092.fastfood.Ingrediente;

/**
 *
 * @author kaiser
 */
public class SanduicheTest extends TestCase {
    public void testGetSetNome() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setNome("Sanduiche saboroso");
        assertEquals(sanduiche.getNome(), "Sanduiche saboroso");
    }

    public void testGetSetIngrediente() {
        Sanduiche sanduiche = new Sanduiche();
        Ingrediente ingrediente = new Ingrediente("alface", 5.10);
        sanduiche.setIngrediente(ingrediente);
        assertTrue(sanduiche.getIngredientes().contains(new Ingrediente("alface", 5.10)));
    }
}