package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Produto {
    private String nome;
    private double valorUnidade;

    private HashSet<ItemProduto> ingredientes = new HashSet<ItemProduto>();

   /* public Produto(String string, double d, HashSet<Ingrediente> ingredientes) {
        throw new UnsupportedOperationException("Not yet implemented");
    }*/

    /*    public Produto(String nome, double valorUnidade, HashSet<ItemProduto> ingredientes) {
        this.nome = nome;
        this.valorUnidade = valorUnidade;
        this.ingredientes = ingredientes;
    }*/
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorUnidade() {
        return valorUnidade;
    }
    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }
    public HashSet<ItemProduto> getIngredientes() {
    	return ingredientes;
    }
    public void setIngredientes(HashSet<ItemProduto> ingredientes) {
    	this.ingredientes = ingredientes;
    }
}
