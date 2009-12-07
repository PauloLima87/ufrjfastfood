package br.ufrj.dcc.so20092.fastfood.model;

import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> item = new HashSet<ItemPedido>();
    private double valorTotal;
    private Integer identificacao;
    private Integer status;
    
    public Pedido(HashSet<ItemPedido> item) {
        this.item = item;
        calculaValorTotal();
        this.status = 0;
        this.identificacao = 400;
    }

    public HashSet<ItemPedido> getItem() {
            return item;
	}
	public void setItem(HashSet<ItemPedido> item) {
            this.setItem(item);
	}
	public double getValorTotal() {
            return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
	}
	public Integer getIdentificacao() {
            return identificacao;
	}
	public void setIdentificacao(Integer identificacao) {
            this.identificacao = identificacao;
	}
	public Integer getStatus() {
            return status;
	}
	public void setStatus(Integer status) {
            this.status = status;
	}
    
	public double calculaValorTotal() {
            double valor = 0.0;
            for (ItemPedido itemPedido : getItem()){
                valor += itemPedido.getQuantidade() * itemPedido.getProduto().getValorUnidade();
            }
            setValorTotal(valor);
            return valor;
	}

    public void adiciona(Produto produto, Integer quantidade) {
    	this.getItem().add(new ItemPedido(produto, quantidade));
    }
}

