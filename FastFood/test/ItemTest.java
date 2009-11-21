import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.pedido.Item;
import br.ufrj.dcc.so20092.fastfood.produto.Produto;
/**
 *
 * @author kaiser
 */
public class ItemTest extends TestCase {
    public void testConstructorProdutoQuantidade() {
        Produto produto = new Produto();
        int quantidade = 5;
        Item item = new Item(produto, quantidade);
        assertTrue(item.getProduto() != null);
        assertEquals(item.getQuantidade(), 5);
    }
    public void testGetSetQuantidade() {
        Item item = new Item();
        item.setQuantidade(3);
        assertEquals(item.getQuantidade(), 3);
    }

    public void testGetSetProduto() {
        Item item = new Item();
        Produto produto = new Produto();
        item.setProduto(produto);
        assertTrue(item.getProduto() != null );
    }
}
