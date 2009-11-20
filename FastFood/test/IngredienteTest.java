import br.ufrj.dcc.so20092.fastfood.Ingrediente;

import junit.framework.TestCase;
/**
 *
 * @author kaiser
 */
public class IngredienteTest extends TestCase {
    public void testConstructorNomeValor() {
        Ingrediente ingrediente = new Ingrediente("alface", 5.10);
        assertEquals(ingrediente.getNome(), "alface");
        assertEquals(ingrediente.getValor(), 5.10);
    }
    public void testGetSetValor() {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setValor(10.5);
        assertEquals(ingrediente.getValor(), 10.5);
    }
    public void testGetSetNome() {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome("alface");
        assertEquals(ingrediente.getNome(), "alface");
    }
}