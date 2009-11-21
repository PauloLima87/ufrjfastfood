import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.Item;
/**
 *
 * @author kaiser
 */
public class ItemTest extends TestCase {

    public void testGetSetPrecoUnitario() {
        Item item = new Item();
        item.setPrecoUnitario(1.5);
        assertEquals(item.getPrecoUnitario(), 1.5);
    }
}
