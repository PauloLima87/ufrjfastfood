package br.ufrj.dcc.so20092.fastfood.model;

public class Ingrediente {
	private String nome;
	private double valor;
        private String unidade;

    public Ingrediente(String nome, double valor, String unidade) {
    	setNome(nome);
    	setValor(valor);
        setUnidade(unidade);

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
    public String getUnidade() {
            return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = new String(unidade);
    }

}
