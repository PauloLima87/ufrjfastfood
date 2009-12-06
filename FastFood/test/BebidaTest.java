import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.model.Bebida;
import br.ufrj.dcc.so20092.fastfood.model.ItemProduto;
import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import java.util.HashSet;


public class BebidaTest extends TestCase {
    public void testConstructorNome() {
        HashSet<ItemProduto> itens = new HashSet<ItemProduto>();
        itens.add(new ItemProduto(new Ingrediente("coca", 2.0), 1));
        Bebida bebida = new Bebida("coca", itens);
        assertEquals(bebida.getIngredientes(), itens);
        assertEquals(bebida.getNome(), "coca");
    }
}