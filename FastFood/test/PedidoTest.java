import br.ufrj.dcc.so20092.fastfood.pedido.Item;
import br.ufrj.dcc.so20092.fastfood.pedido.Pedido;
import br.ufrj.dcc.so20092.fastfood.produto.Sanduiche;
import junit.framework.TestCase;

/**
 *
 * @author kaiser
 */
public class PedidoTest extends TestCase {
    public void testGetSetItemPedido() {
        Item item = new Item();
        Pedido pedido = new Pedido();
        pedido.setItem(item);
        assertEquals(pedido.getItems().size(), 1);
    }

    public void testGetValorTotal() {
        //TODO: Implementar!
    }
}
