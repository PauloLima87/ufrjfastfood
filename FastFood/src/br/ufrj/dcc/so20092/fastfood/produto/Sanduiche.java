package br.ufrj.dcc.so20092.fastfood.produto;

import br.ufrj.dcc.so20092.fastfood.produto.Produto;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kaiser
 */
public class Sanduiche extends Produto {
    private String nome;
    private Set<Ingrediente> ingredientes = new HashSet<Ingrediente>();
    private double valorUnidade;

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
