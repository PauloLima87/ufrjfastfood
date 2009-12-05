package fastfood.model;

import java.util.HashSet;

import fastfood.model.Produto;


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



/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bebida)) return false;
        Bebida ing = (Bebida)o;
        return (nome == null ? ing.nome == null : nome.equals(ing.nome));
    }

    @Override
    public int hashCode() {
        int result;
        result = nome.hashCode();
        result += (int) (valorUnidade);
        return result;
    }*/
}