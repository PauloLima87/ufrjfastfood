import br.ufrj.dcc.so20092.fastfood.Ingrediente;

import junit.framework.TestCase;
/**
 *
 * @author kaiser
 */
public class IngredienteTest extends TestCase {
    public void testGetSetValor() {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setValor(10.5);
        assertEquals(10.5, ingrediente.getValor());
    }
    public void testGetSetNome() {
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome("alface");
        assertEquals("alface", ingrediente.getNome());
    }
}