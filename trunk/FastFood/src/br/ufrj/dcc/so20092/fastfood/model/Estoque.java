package fastfood.model;

import java.util.HashSet;

public class Estoque {
	private HashSet<ItemEstoque> itemEstoque;

	public Estoque () {
		itemEstoque = new HashSet<ItemEstoque>();
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
