package br.ufrj.dcc.so20092.fastfood.produto;

import br.ufrj.dcc.so20092.fastfood.produto.Produto;

public class Bebida extends Produto {
    private String nome;
    private double valorUnidade;

    public Bebida() {

    }

    public Bebida(String nome, double valorUnidade) {
        this.nome = nome;
        this.valorUnidade = valorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValor(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bebida)) return false;
        Bebida ing = (Bebida)o;
        return (nome == null ? ing.nome == null : nome.equals(ing.nome));
    }

    @Override
    public int hashCode() {
        int result;
        result = nome.hashCode();
        result += (int) (valorUnidade);
        return result;
    }
}