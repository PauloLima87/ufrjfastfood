package br.ufrj.dcc.so20092.fastfood.model;

import java.util.concurrent.Semaphore;

//Solving the mutual exclusion problem using Semaphore class

public class CaixaAtendimento extends Thread
{
    private static FilaAtendimento fila;
    private int id;
    private Semaphore sem;
    private Boolean disponivel = true;
    private Cliente cliente;


    public static FilaAtendimento getFila() {
        return fila;
    }

    public static void setFila(FilaAtendimento aFila) {
        fila = aFila;
    }

    public CaixaAtendimento(int i, Semaphore s)
    {
        this.id = i;
        this.sem = s;
        System.out.println("CaixaAtendimento " + i + " aberta!");
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    private int random(int n)
    {
        return (int) Math.round(n * Math.random() - 0.5);
    }

    private void waitAtendimento()
    {
        try
        {
            sleep(random(2000)+1000);
        } catch (InterruptedException e)
        {
        }
    }

    private synchronized Boolean verificarDisponibilidadePedido()
    {
        System.out.println("Caixa Atendimento " + id + " Verificando disponibilidade do pedido.");
        waitAtendimento();
        //System.out.println("Caixa Atendimento " + id + " Verificando disponibilidade do pedido.");
        return true;
    }

    public synchronized Boolean atende() {

        System.out.println("Iniciando atendimento do cliente");
        this.disponivel = false;
        cliente = getFila().getNext();
        System.out.println("Checando disponibilidade do pedido");
        if (!verificarDisponibilidadePedido()) {
            System.out.println("nao foi possivel atender o pedido...");
            this.disponivel = true;
            this.cliente = null;
            return false;
        }
        return true;
    }

    public synchronized void run()
    {
        while(true) {
/*
            System.out.println(this.disponivel);
            System.out.println(this.fila.getFila().size());
            System.out.println("Thread " + this.id);
*/

            try
            {
                sem.acquire();
            } catch (InterruptedException e)
            {
                System.out.println()
                // ...
            }
            if (this.disponivel && !(this.fila.getFila().size() == 0)) {
                if (atende()) {
                    System.out.println("Encaminhando cliente a fila de pagamento.");
                }
            }
            sem.release();
        }
    }
}
