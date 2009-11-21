import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.produto.Sanduiche;
import br.ufrj.dcc.so20092.fastfood.ingrediente.Ingrediente;

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

    public void testGetValorUnidade() {
        Sanduiche sanduiche = new Sanduiche();
        Ingrediente ingrediente1 = new Ingrediente("alface", 1.0, 2);
        Ingrediente ingrediente2 = new Ingrediente("tomate", 1.0, 2);
        sanduiche.setIngrediente(ingrediente1);
        sanduiche.setIngrediente(ingrediente2);
        assertEquals(sanduiche.getValorUnidade(), 4.0);
    }
}