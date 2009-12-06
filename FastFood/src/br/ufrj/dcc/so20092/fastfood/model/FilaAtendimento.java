/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufrj.dcc.so20092.fastfood.model;

import java.util.ArrayList;

/**
 *
 * @author kaiser
 */
public class FilaAtendimento {
    private ArrayList<Cliente> fila = new ArrayList<Cliente>();

    public void addCliente(Cliente cliente) {
        getFila().add(cliente);
    }

    public ArrayList<Cliente> getFila() {
        return fila;
    }

    public void setFila(ArrayList<Cliente> fila) {
        this.fila = fila;
    }

    public Cliente getNext() {
        return this.fila.remove(0);
    }
}