package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Bebida extends Produto {
	
    public Bebida(String nome, HashSet<ItemProduto> ingredientes) {
    	setNome(nome);
    	setIngredientes(ingredientes);
        Double valor = 0.0;
        for (ItemProduto itemProduto : ingredientes) {
            valor += itemProduto.getIngrediente().getValor() * itemProduto.getQuantidade();
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