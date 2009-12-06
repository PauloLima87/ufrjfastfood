import br.ufrj.dcc.so20092.fastfood.model.CaixaAtendimento;

import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;
import junit.framework.TestCase;


public class CaixaAtendimentoTest extends TestCase {
    public void testConstrutor() {
        FilaAtendimento fa = new FilaAtendimento();
        CaixaAtendimento ca = new CaixaAtendimento(1, fa);
        assertEquals(ca.getId(), new Integer(1));
    }

    public void testGetNext() {
        FilaAtendimento fa = new FilaAtendimento();
        CaixaAtendimento c1 = new CaixaAtendimento(1, fa);
        CaixaAtendimento c2 = new CaixaAtendimento(2, fa);
        CaixaAtendimento c3 = new CaixaAtendimento(3, fa);
        fa.addCliente(new Cliente());
        fa.addCliente(new Cliente());
        fa.addCliente(new Cliente());
        c1.getProximoCliente();
        c2.getProximoCliente();
        c3.getProximoCliente();
        assertEquals(fa.filaVazia(), Boolean.TRUE);
    }

    public void testVerificarDisponibilidadePedido() {
        FilaAtendimento fa = new FilaAtendimento();
        CaixaAtendimento c1 = new CaixaAtendimento(1, fa);
        CaixaAtendimento c2 = new CaixaAtendimento(2, fa);
        CaixaAtendimento c3 = new CaixaAtendimento(3, fa);
        fa.addCliente(new Cliente());
        c1.getProximoCliente();


    }
}
