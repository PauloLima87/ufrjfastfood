
import br.ufrj.dcc.so20092.fastfood.model.Cliente;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class FilaAtendimentoTest {
    public void testAdd() {
        FilaAtendimento fa = new FilaAtendimento();
        Cliente cliente = new Cliente();
        fa.addCliente(cliente);
        assertEquals(fa.getFila().contains(), cliente);

    }
}
