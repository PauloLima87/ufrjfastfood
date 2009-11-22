package br.ufrj.dcc.so20092.fastfood.pedido;

import br.ufrj.dcc.so20092.fastfood.produto.Produto;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pedido {
    private Set<Item> itens = new HashSet<Item>();
    private double valorTotal;

    public void setItem(Item item) {
        this.itens.add(item);
    }

    public Set<Item> getItems() {
        return this.itens;
    }

    public double getValorTotal() {
        Iterator it = itens.iterator();
        while(it.hasNext()) {
            Item item = (Item) it.next();
            this.valorTotal += item.getQuantidade()*item.getProduto().getValorUnidade();
        }
        return valorTotal;
    }
}