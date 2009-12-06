package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Sanduiche extends Produto {
    
    public Sanduiche(String nome, HashSet<ItemProduto> ingredientes) {
        setNome(nome);
        setIngredientes(ingredientes);
        Double valor = 0.0;
        for (ItemProduto itemProduto : ingredientes) {
        	valor += itemProduto.getIngrediente().getValor() * itemProduto.getQuantidade();
        }
        valor *= 1.3;
        setValorUnidade(valor);
    }
}
