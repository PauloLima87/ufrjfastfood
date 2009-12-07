import br.ufrj.dcc.so20092.fastfood.model.CaixaAtendimento;

import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.Estoque;
import br.ufrj.dcc.so20092.fastfood.model.FilaPagamento;
import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import br.ufrj.dcc.so20092.fastfood.model.ItemEstoque;
import junit.framework.TestCase;


public class CaixaAtendimentoTest extends TestCase {
    public void testConstrutor() {
        FilaPagamento fa = new FilaPagamento();
        CaixaAtendimento ca = new CaixaAtendimento(1, fa);
        assertEquals(ca.getId(), new Integer(1));
    }

    public void testGetNext() {
        FilaPagamento fa = new FilaPagamento();
        CaixaAtendimento c1 = new CaixaAtendimento(1, fa);
        CaixaAtendimento c2 = new CaixaAtendimento(2, fa);
        CaixaAtendimento c3 = new CaixaAtendimento(3, fa);
        fa.addCliente(new Cliente());
        c1.getProximoCliente();
        assertEquals(fa.filaVazia(), Boolean.TRUE);
    }

    public void testVerificarDisponibilidadePedido() {
        Estoque estoque = new Estoque();
        ItemEstoque ie = new ItemEstoque(new Ingrediente("Queijo",1.5),3500);
        ItemEstoque ie2 = new ItemEstoque(new Ingrediente("Presunto",2.5),4500);
        estoque.setItemEstoque(ie);
        estoque.setItemEstoque(ie2);
    }
}
