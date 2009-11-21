package br.ufrj.dcc.so20092.fastfood;

public class Bebida {
	private String nome;
	private double valor;

	public Bebida() {

	}

	public Bebida(String nome, Integer valor) {
		setNome(nome);
		setValor(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
