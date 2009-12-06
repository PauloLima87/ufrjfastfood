
import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;

import junit.framework.TestCase;

public class FilaAtendimentoTest extends TestCase {
    public void testAddCliente() {
        FilaAtendimento fa = new FilaAtendimento();
        Cliente cliente = new Cliente();
        fa.addCliente(cliente);
        fa.addCliente(cliente);
        assertEquals(fa.getFila().size(), 2);
    }
}