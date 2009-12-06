import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import br.ufrj.dcc.so20092.fastfood.model.ItemProduto;
import br.ufrj.dcc.so20092.fastfood.model.Sanduiche;
import junit.framework.TestCase;

import java.util.HashSet;

/**
 *
 * @author kaiser
 */
public class SanduicheTest extends TestCase {
    public void testConstructorNome() {
        HashSet<ItemProduto> itens = new HashSet<ItemProduto>();
        itens.add(new ItemProduto(new Ingrediente("sanduba", 2.0), 1));
        Sanduiche sanduiche = new Sanduiche("sanduba", itens);
        assertEquals(sanduiche.getIngredientes(), itens);
        assertEquals(sanduiche.getNome(), "sanduba");
    }
}