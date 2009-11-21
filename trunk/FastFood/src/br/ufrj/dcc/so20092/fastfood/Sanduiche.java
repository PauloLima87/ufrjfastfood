package br.ufrj.dcc.so20092.fastfood;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kaiser
 */
public class Sanduiche {
    private String nome;
    private Set<Ingrediente> ingredientes = new HashSet<Ingrediente>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Set<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }
}
