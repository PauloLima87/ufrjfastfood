package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.util.HashSet;
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
            sleep(5000);
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

    public synchronized void atualizaCaixa() {
        String pedido = "";
        try {
            HashSet<ItemPedido> itensPedido = this.cliente.getPedido().getItem();
            for (ItemPedido item : itensPedido) {
                String produto = item.getProduto().getNome();
                Integer quantidade = item.getQuantidade();
                pedido += produto + " - " + quantidade + "\n";
            }
            if (this.id == 0) {
                TelaPrincipal.caixaAtendimento0.setText(pedido);
            } else if (this.id == 1) {
                TelaPrincipal.caixaAtendimento1.setText(pedido);
            } else if (this.id == 2) {
                TelaPrincipal.caixaAtendimento2.setText(pedido);
            }
        } catch(Exception e) {
            System.out.println("Erro no atualizar caixa...");
        }
    }
    
    public synchronized Boolean atende() {
        System.out.println("Iniciando atendimento do cliente");
        cliente = getFila().getNext();
        atualizaCaixa();
        this.disponivel = false;
        TelaPrincipal.atualizarClientes();
        if (!verificarDisponibilidadePedido()) {
            System.out.println("Não foi possivel atender o pedido...");
            this.disponivel = true;
            this.cliente = null;
            TelaPrincipal.esvaziarCaixa(this.id);
            return false;
        }
        this.disponivel = true;
        TelaPrincipal.esvaziarCaixa(this.id);
        System.out.println("Encaminhando cliente a fila de pagamento.");
        return true;
    }

    public synchronized void run()
    {
        System.out.println("cheguei no run");
        while(true) {

            try
            {
                sem.acquire();
            } catch (InterruptedException e)
            {
                // ...
            }
//            synchronized(fila) {
            if (this.disponivel && !(this.fila.getFila().size() == 0)) {
                atende();
            }
            sem.release();
  //          }
        }
    }
}
