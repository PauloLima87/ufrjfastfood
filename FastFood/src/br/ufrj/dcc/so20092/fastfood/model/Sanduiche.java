package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Sanduiche extends Produto {
    
    public Sanduiche(String nome, HashSet<ItemEstoque> ingredientes) {
        setNome(nome);
        setIngredientes(ingredientes);
        Double valor = 0.0;
        for (ItemEstoque itemEstoque : ingredientes) {
        	valor += itemEstoque.getIngrediente().getValor() * itemEstoque.getQuantidade();
        }
        valor *= 1.3;
        setValorUnidade(valor);
    }
}
