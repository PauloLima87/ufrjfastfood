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
        try {
            return this.fila.remove(0);
        } catch (Exception e) {
            return new Cliente();
        }
    }

    public Boolean filaVazia(){
        if(fila.size() > 0){
            return false;
        } else {
            return true;
        }
    }
/*
    public static void addClienteFilaGlobal(Cliente cliente){
        filaAtendimento.addCliente(cliente);
    }

    public static Cliente getClienteFilaGlobal(){
        try {
            return filaAtendimento.getNext();
        } catch (Exception e) {
            return new Cliente();
        }
    }

    public static Integer getSizeFilaGlobal(){
        return filaAtendimento.size();
    }
    */
}