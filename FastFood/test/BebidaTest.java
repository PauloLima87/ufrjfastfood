import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.produto.Bebida;
import br.ufrj.dcc.so20092.fastfood.produto.Ingrediente;


public class BebidaTest extends TestCase {
    public void testConstructorNomeValor() {
        Bebida bebida = new Bebida("coca", 2.10);
        assertEquals(bebida.getNome(), "coca");
        assertEquals(bebida.getValorUnidade(), 2.10);
    }

    public void testGetSetValor() {
        Bebida bebida = new Bebida();
        bebida.setValor(1.5);
        assertEquals(bebida.getValorUnidade(), 1.5);
    }

    public void testGetSetNome() {
        Bebida bebida = new Bebida();
        bebida.setNome("sprite");
        assertEquals(bebida.getNome(), "sprite");
    }

    public void testBebidasDiferentes() {
        Bebida bebida1 = new Bebida("a", 1);
        Bebida bebida2 = new Bebida("b", 2);
        assertEquals(bebida1.equals(new Bebida("b", 2)), false);
    }

    public void testBebidasIguais() {
        Bebida bebida1 = new Bebida("coca", 1.2);
        Bebida bebida2 = new Bebida("coca", 1.2);
        assertEquals(bebida1.equals(new Bebida("coca", 1.2)), true);
    }
}
