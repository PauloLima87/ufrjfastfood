package br.ufrj.dcc.so20092.fastfood.model;

public class ItemPedido {
	private Produto produto;
	private Integer quantidade;
	
	public ItemPedido(Produto produto, Integer quandidade) {
		setProduto(produto);
		setQuantidade(quandidade);
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}	
}
