package br.ufrj.dcc.so20092.fastfood;

/**
 *
 * @author kaiser
 */
public class Ingrediente {
    private String nome;
    private double valor;
    private int quantidade;

    public Ingrediente() {

    }
    
    public Ingrediente(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Ingrediente(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingrediente)) return false;
        Ingrediente ing = (Ingrediente)o;
        return (nome == null ? ing.nome == null : nome.equals(ing.nome));
    }
    
    @Override
    public int hashCode() {
        int result;
        result = nome.hashCode();
        result += (int) (valor);
        return result;
    }
}
