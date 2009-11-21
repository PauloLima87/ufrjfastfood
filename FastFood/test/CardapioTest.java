
import br.ufrj.dcc.so20092.fastfood.Cardapio;
import br.ufrj.dcc.so20092.fastfood.produto.Sanduiche;
import junit.framework.TestCase;

/**
 *
 * @author kaiser
 */
public class CardapioTest extends TestCase {
    public void testGetSanduiches() {
        Cardapio cardapio = new Cardapio();
        assertTrue(cardapio.getSanduiches().size() == 3);
        assertTrue(cardapio.getBebidas().size() == 3);
    }
    
    public void testGetSetSanduiche() {
        Cardapio cardapio = new Cardapio();
        Sanduiche sanduiche = cardapio.getSanduiche("Numero1");
        assertEquals(sanduiche.getNome(), "Numero1");
    }
}
