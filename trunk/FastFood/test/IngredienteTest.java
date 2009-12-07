import br.ufrj.dcc.so20092.fastfood.model.Ingrediente;
import junit.framework.TestCase;


/**
 *
 * @author kaiser
 */
public class IngredienteTest extends TestCase {
    public void testConstructor() {
        Ingrediente ingrediente = new Ingrediente("queijo", 10.0, "gramas");
        assertEquals("queijo", ingrediente.getNome());
        assertEquals(10.0,ingrediente.getValor());
    }
}