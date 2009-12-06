
import br.ufrj.dcc.so20092.fastfood.model.ItemPedido;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
import br.ufrj.dcc.so20092.fastfood.model.Bebida;
import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import br.ufrj.dcc.so20092.fastfood.model.ItemProduto;
import java.util.HashSet;
import junit.framework.TestCase;

/**
 *
 * @author kaiser
 */
public class PedidoTest extends TestCase {
    public void testConstructor() {
        HashSet<ItemPedido> itens = new HashSet<ItemPedido>();
        HashSet<ItemProduto> ingredientes = new HashSet<ItemProduto>();
        ingredientes.add(new ItemProduto(new Ingrediente("coca", 2.0), 1));
        System.out.println("aaa");
        itens.add(new ItemPedido(new Bebida("coca", ingredientes), 2));
        System.out.println("aaa");
        Pedido p = new Pedido(itens);
    }
}
