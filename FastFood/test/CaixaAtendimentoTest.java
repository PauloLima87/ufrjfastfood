import br.ufrj.dcc.so20092.fastfood.model.CaixaAtendimento;

import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;
import junit.framework.TestCase;


public class CaixaAtendimentoTest extends TestCase {
    public void testConstrutor() {
        CaixaAtendimento ca = new CaixaAtendimento(1);
        assertEquals(ca.getId(), new Integer(1));
    }

    public void testgetNext() {
        CaixaAtendimento ca = new CaixaAtendimento(1);
        ca.setDisponivel(true);
        FilaAtendimento fa = new FilaAtendimento();
        Cliente cliente = new Cliente();
        fa.addCliente(cliente);
        assertEquals(ca.getNext(), cliente);

    }
}
