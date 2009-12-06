/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufrj.dcc.so20092.fastfood.model;

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
        pedido = new Pedido();
    }
}
