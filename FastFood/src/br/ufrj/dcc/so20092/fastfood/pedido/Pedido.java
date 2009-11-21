package br.ufrj.dcc.so20092.fastfood.pedido;

import java.util.HashSet;
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
}