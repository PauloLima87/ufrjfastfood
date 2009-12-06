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
        Cardapio cardapio = new Cardapio();
        ArrayList<Sanduiche> sanduiches = cardapio.getSanduiches();
        ArrayList<Bebida> bebidas = cardapio.getBebidas();

        Random random = new Random();
        Integer escolhaSanduiche = random.nextInt(2) + 1;
        Integer escolhaBebida = random.nextInt(2) + 1;
        Integer numeroSanduiches = random.nextInt(4) + 1;
        Integer numeroBebidas = random.nextInt(4) + 1;

        HashSet<ItemPedido> ip = new HashSet<ItemPedido>();
        ip.add(new ItemPedido(sanduiches.get(escolhaSanduiche), numeroSanduiches));
        ip.add(new ItemPedido(bebidas.get(escolhaBebida), numeroBebidas));

        pedido = new Pedido(ip);
    }
}
