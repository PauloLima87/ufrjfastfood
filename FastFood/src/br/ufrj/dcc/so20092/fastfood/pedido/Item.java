package br.ufrj.dcc.so20092.fastfood.pedido;

import br.ufrj.dcc.so20092.fastfood.produto.Produto;

/**
 *
 * @author kaiser
 */
public class Item {
    private Produto produto;
    private int quantidade;

    public Item() {

    }
    
    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }


}
