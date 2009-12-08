package br.ufrj.dcc.so20092.fastfood.model;

public class ItemProduto {

    private Ingrediente ingrediente;
    private Integer quantidade;

    public ItemProduto(Ingrediente ingrediente, Integer quantidade) {
        setIngrediente(ingrediente);
        setQuantidade(quantidade);
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}