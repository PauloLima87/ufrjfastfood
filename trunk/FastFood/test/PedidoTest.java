import br.ufrj.dcc.so20092.fastfood.Cardapio;
import br.ufrj.dcc.so20092.fastfood.pedido.Item;
import br.ufrj.dcc.so20092.fastfood.pedido.Pedido;
import br.ufrj.dcc.so20092.fastfood.produto.Bebida;
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
        Cardapio cardapio = new Cardapio();
        Sanduiche sanduiche = cardapio.getSanduiche("Numero1");
        Bebida bebida = cardapio.getBebida("coca");
        Item item1 = new Item(sanduiche, 1);
        Item item2 = new Item(bebida, 1);
        Pedido pedido = new Pedido();
        pedido.setItem(item1);
        pedido.setItem(item2);
        assertEquals((bebida.getValorUnidade()+sanduiche.getValorUnidade()), pedido.getValorTotal());
    }
}
