
import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaPagamento;

import junit.framework.TestCase;

public class FilaAtendimentoTest extends TestCase {
    public void testAddCliente() {
        FilaPagamento fa = new FilaPagamento();
        Cliente cliente = new Cliente();
        fa.addCliente(cliente);
        fa.addCliente(cliente);
        assertEquals(fa.getFila().size(), 2);
    }
}