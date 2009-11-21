import junit.framework.TestCase;

import br.ufrj.dcc.so20092.fastfood.Ingrediente;

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
    public void testIngredientesDiferentes() {
        Ingrediente ingrediente1 = new Ingrediente("a", 1);
        Ingrediente ingrediente2 = new Ingrediente("b", 2);
        assertEquals(ingrediente1.equals(ingrediente2), false);
    }
    public void testIngredientesIguais() {
        Ingrediente ingrediente1 = new Ingrediente("batata", 1.2);
        Ingrediente ingrediente2 = new Ingrediente("batata", 1.2);
        assertEquals(ingrediente1.equals(ingrediente2), true);
    }
}