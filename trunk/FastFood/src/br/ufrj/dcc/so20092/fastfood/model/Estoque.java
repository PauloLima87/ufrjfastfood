package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Estoque {
    public static HashSet<ItemEstoque> itensEstoque;

    public Estoque () {
        itensEstoque = new HashSet<ItemEstoque>();
        itensEstoque.add(new ItemEstoque(Cardapio.alface, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.azeite, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.beterraba, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.cenoura, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.creamCheese, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.ispraite, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.koka, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.pao, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.paoForma, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.peitoFrango, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.peitoPeru, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.phanta, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.presuntoParma, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.queijoMinas, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.requeijao, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.rucula, 1000));
        itensEstoque.add(new ItemEstoque(Cardapio.tomate, 1000));
    }

    public HashSet<ItemEstoque> getItemEstoque() {
        return itensEstoque;
    }
    public void setItemEstoque(HashSet<ItemEstoque> itemEstoque) {
        this.itensEstoque = itemEstoque;
    }

    public void adiciona(Ingrediente ingrediente, Integer quantidade) {
        for (ItemEstoque item : itensEstoque) {
            if (item.getIngrediente() == ingrediente) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        this.itensEstoque.add(new ItemEstoque(ingrediente, quantidade));
    }

    public boolean remove(Ingrediente ingrediente, Integer quantidade) {
        for (ItemEstoque item : itensEstoque) {
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
