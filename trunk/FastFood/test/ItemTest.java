import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.pedido.ItemPedido;
import br.ufrj.dcc.so20092.fastfood.produto.Produto;
/**
 *
 * @author kaiser
 */
public class ItemTest extends TestCase {

    public void testGetSetQuantidade() {
        ItemPedido item = new ItemPedido();
        item.setQuantidade(3);
        assertEquals(item.getQuantidade(), 3);
    }

    public void testGetSetProduto() {
        ItemPedido item = new ItemPedido();
        Produto produto = new Produto();
        item.setProduto(produto);
        assertTrue(item.getProduto() != null );
    }
}
