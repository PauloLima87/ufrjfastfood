package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

import br.ufrj.dcc.so20092.fastfood.model.Produto;
import org.netbeans.spi.palette;

public class Bebida extends Produto {
	
    public Bebida(String nome, HashSet<ItemEstoque> ingredientes) {
    	setNome(nome);
    	setIngredientes(ingredientes);
        Double valor = 0.0;
        for (ItemEstoque itemEstoque : ingredientes) {
			valor += itemEstoque.getIngrediente().getValor() * itemEstoque.getQuantidade();
		}
        setValorUnidade(valor);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bebida)) return false;
        Bebida ing = (Bebida)o;
        return (this.getNome() == null ? ing.getNome() == null : this.getNome().equals(ing.getNome()));
    }

    @Override
    public int hashCode() {
        int result;
        result = this.getNome().hashCode();
        result += (int) (this.getValorUnidade());
        return result;
    }
}