/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufrj.dcc.so20092.fastfood.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Pablo
 */
public class Cliente {
    private Pedido pedido;

    public Cliente() {
        sorteiaPedido();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    private void sorteiaPedido() {
        ArrayList<Sanduiche> sanduiches = (new Cardapio()).getSanduiches();
        ArrayList<Bebida> bebidas = (new Cardapio()).getBebidas();
        Random random = new Random();
        Integer escolhaSanduiche = random.nextInt(3);
        Integer escolhaBebida = random.nextInt(3);

        sanduiches.get(escolhaSanduiche);

    }
}
