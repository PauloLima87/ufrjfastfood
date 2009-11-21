package br.ufrj.dcc.so20092.fastfood;

import br.ufrj.dcc.so20092.fastfood.produto.Bebida;
import br.ufrj.dcc.so20092.fastfood.produto.Ingrediente;
import br.ufrj.dcc.so20092.fastfood.produto.Sanduiche;
import java.util.HashSet;
import java.util.Set;

public class Cardapio {

    private Set<Sanduiche> sanduiches = new HashSet<Sanduiche>();
    private Set<Bebida> bebidas = new HashSet<Bebida>();

    public Cardapio() {
        Set<Ingrediente> ingredientes = new HashSet<Ingrediente>();

        //Lista de ingredientes
        Ingrediente alface = new Ingrediente("alface", 0.2);
        Ingrediente tomate = new Ingrediente("tomate", 0.5);
        Ingrediente hamburguer = new Ingrediente("hamburguer", 1.0);
        Ingrediente bacon = new Ingrediente("bacon", 0.5);
        Ingrediente pao = new Ingrediente("pao", 0.5);
        Ingrediente molho = new Ingrediente("molho", 1.2);

        //Lista de bebidas
        Bebida sprite = new Bebida("sprite", 1.2);
        Bebida coca = new Bebida("coca", 1.5);
        Bebida kuat = new Bebida("kuat", 1.0);

        //Lista de sanduiches
        //Sanduiche1
        alface.setQuantidade(2);
        ingredientes.add(alface);
        bacon.setQuantidade(2);
        ingredientes.add(bacon);
        hamburguer.setQuantidade(1);
        ingredientes.add(hamburguer);
        pao.setQuantidade(2);
        ingredientes.add(pao);
        Sanduiche sand1 = new Sanduiche("Numero1", ingredientes);

        ingredientes.clear();

        //Sanduiche2
        tomate.setQuantidade(2);
        ingredientes.add(tomate);
        molho.setQuantidade(1);
        ingredientes.add(molho);
        hamburguer.setQuantidade(1);
        ingredientes.add(hamburguer);
        pao.setQuantidade(2);
        ingredientes.add(pao);
        Sanduiche sand2 = new Sanduiche("Numero2", ingredientes);
        
        ingredientes.clear();       
        
        //Sanduiche3
        alface.setQuantidade(2);
        ingredientes.add(alface);        
        tomate.setQuantidade(2);
        ingredientes.add(tomate);
        hamburguer.setQuantidade(2);
        ingredientes.add(hamburguer);        
        bacon.setQuantidade(2);
        ingredientes.add(bacon);
        pao.setQuantidade(3);
        ingredientes.add(pao);
        molho.setQuantidade(2);
        ingredientes.add(molho);
        Sanduiche sand3 = new Sanduiche("Numero3", ingredientes);

        this.sanduiches.add(sand1);
        this.sanduiches.add(sand2);
        this.sanduiches.add(sand3);
        this.bebidas.add(sprite);
        this.bebidas.add(coca);
        this.bebidas.add(kuat);
    }
}