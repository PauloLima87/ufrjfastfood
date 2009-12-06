package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Estoque {
    private HashSet<ItemEstoque> itemEstoque;

    public Estoque () {
        itemEstoque = new HashSet<ItemEstoque>();
        //itemEstoque.add(new ItemEstoque(new Ingrediente("alfafa",0.75),1000));
        //itemEstoque.add(new ItemEstoque(new Ingrediente("alfofo",3.75),2000));
        //itemEstoque.add(new ItemEstoque(new Ingrediente("alfifi",5.69),3000));
    }

    public HashSet<ItemEstoque> getItemEstoque() {
        return itemEstoque;
    }
    public void setItemEstoque(HashSet<ItemEstoque> itemEstoque) {
        this.itemEstoque = itemEstoque;
    }

    public void adiciona(Ingrediente ingrediente, Integer quantidade) {
        for (ItemEstoque item : itemEstoque) {
            if (item.getIngrediente() == ingrediente) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        this.itemEstoque.add(new ItemEstoque(ingrediente, quantidade));
    }

    public boolean remove(Ingrediente ingrediente, Integer quantidade) {
        for (ItemEstoque item : itemEstoque) {
            if (item.getIngrediente() == ingrediente) {
                if (item.getQuantidade() - quantidade >= 0) {
                    item.setQuantidade(item.getQuantidade() - quantidade);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
