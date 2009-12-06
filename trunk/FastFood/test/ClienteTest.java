import br.ufrj.dcc.so20092.fastfood.model.Bebida;
import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import br.ufrj.dcc.so20092.fastfood.model.ItemPedido;
import br.ufrj.dcc.so20092.fastfood.model.ItemProduto;
import br.ufrj.dcc.so20092.fastfood.model.Produto;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
import java.util.HashSet;
import java.util.Iterator;
import junit.framework.TestCase;


/**
 *
 * @author kaiser
 */
public class ClienteTest extends TestCase {
    

    public void testSetPedido() {
        Cliente cliente = new Cliente();
        HashSet<ItemPedido> itens = new HashSet<ItemPedido>();
        HashSet<ItemProduto> itens_produto = new HashSet<ItemProduto>();
        itens_produto.add(new ItemProduto(new Ingrediente("lata de guarana", 1.5), 1));
        itens.add(new ItemPedido(new Bebida("Guarana",itens_produto),2));

        Pedido pedido = new Pedido(itens);
        cliente.setPedido(pedido);
        assertEquals(cliente.getPedido(), pedido);
    }

    public void testSorteiaPedido() {
        Cliente cliente = new Cliente();
        assertNotNull(cliente.getPedido());
        /*for (ItemPedido ip : cliente.getPedido().getItem()) {
            System.out.println(ip.getProduto().getNome() + " " + ip.getQuantidade());
        }*/
    }

}