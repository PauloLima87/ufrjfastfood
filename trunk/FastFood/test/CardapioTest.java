
import br.ufrj.dcc.so20092.fastfood.Cardapio;
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
}
