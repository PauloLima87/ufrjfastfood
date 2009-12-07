package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.PanelSimulacao;
import java.awt.Color;
import java.util.HashSet;
import java.util.concurrent.Semaphore;

//Solving the mutual exclusion problem using Semaphore class

public class CaixaPagamento extends Thread
{
    private static FilaPagamento fila;
    private int id;
    private Semaphore sem;
    private Boolean disponivel = true;
    private Cliente cliente;


    public static FilaPagamento getFila() {
        return fila;
    }

    public static void setFila(FilaPagamento aFila) {
        fila = aFila;
    }

    public CaixaPagamento(int i, Semaphore s)
    {
        this.id = i;
        this.sem = s;
        System.out.println("CaixaPagamento " + i + " aberta!");
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

    private synchronized Boolean efetuarPagamento()
    {
        System.out.println("Caixa Pagamento " + id + " efetuando pagamento...");
        waitAtendimento();
        return true;
    }

    public synchronized void atualizaCaixa() {
        String pedido = "";
        HashSet<ItemPedido> itensPedido = this.cliente.getPedido().getItem();
        for (ItemPedido item : itensPedido) {
            String produto = item.getProduto().getNome();
            Integer quantidade = item.getQuantidade();
            pedido += produto + " - " + quantidade + "\n";
        }
        if (this.id == 0) {
            PanelSimulacao.caixaPagamento0.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaPagamento0.setText(pedido);
        } else if (this.id == 1) {
            PanelSimulacao.caixaPagamento1.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaPagamento1.setText(pedido);
        } else if (this.id == 2) {
            PanelSimulacao.caixaPagamento2.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaPagamento2.setText(pedido);
        }
    }

    public synchronized Boolean atende() {
        System.out.println("Iniciando atendimento do cliente");
        cliente = getFila().getNext();
        atualizaCaixa();
        this.disponivel = false;
        PanelSimulacao.atualizarClientes();
        if (!efetuarPagamento()) {
            System.out.println("Não foi possivel atender o pedido...");
            this.disponivel = true;
            this.cliente = null;
            PanelSimulacao.esvaziarCaixa(this.id);
            return false;
        }
        this.disponivel = true;
        PanelSimulacao.esvaziarCaixa(this.id);
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
            if (this.disponivel && !(this.fila.getFila().size() == 0)) {
                atende();
            }
            sem.release();
        }
    }
}
