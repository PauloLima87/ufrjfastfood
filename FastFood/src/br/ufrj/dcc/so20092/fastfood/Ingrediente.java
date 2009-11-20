package br.ufrj.dcc.so20092.fastfood;

/**
 *
 * @author kaiser
 */
public class Ingrediente {
    private String nome;
    private double valor;

    public Ingrediente() {

    }
    
    public Ingrediente(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
