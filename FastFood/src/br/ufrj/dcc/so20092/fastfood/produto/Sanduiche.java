package br.ufrj.dcc.so20092.fastfood.produto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author kaiser
 */
public class Sanduiche extends Produto {
    private String nome;
    private Set<Ingrediente> ingredientes = new HashSet<Ingrediente>();
    private double valorUnidade;

    public Sanduiche() {

    }
    
    public Sanduiche(String nome, Set<Ingrediente> ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        Iterator it = ingredientes.iterator();
        while(it.hasNext()) {
            Ingrediente ingrediente = (Ingrediente) it.next();
            this.valorUnidade += ingrediente.getValorUnidade()*ingrediente.getQuantidade();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
        this.valorUnidade += ingrediente.getValorUnidade()*ingrediente.getQuantidade();
    }

    public Set<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }
}
