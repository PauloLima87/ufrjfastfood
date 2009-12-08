package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.PanelSimulacao;
import java.awt.Color;
import java.util.HashSet;
import java.util.concurrent.Semaphore;

public class Cozinheiro extends Thread
{
    private static FilaCozinheiro fila;
    private int id;
    private Semaphore sem;
    private Boolean disponivel = true;
    private Cliente cliente;


    public static FilaCozinheiro getFila() {
        return fila;
    }

    public static void setFila(FilaCozinheiro aFila) {
        fila = aFila;
    }

    public Cozinheiro(int i, Semaphore s)
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
            sleep(random(3000)+2000);
        } catch (InterruptedException e)
        {
        }
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
            PanelSimulacao.caixaCozinheiro0.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaCozinheiro0.setText(pedido);
        } else if (this.id == 1) {
            PanelSimulacao.caixaCozinheiro1.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaCozinheiro1.setText(pedido);
        } else if (this.id == 2) {
            PanelSimulacao.caixaCozinheiro2.setBackground(new Color(255, 0, 0));
            PanelSimulacao.caixaCozinheiro2.setText(pedido);
        }
    }

    public synchronized Boolean atende() {
        System.out.println("Iniciando preparo do pedido");
        cliente = getFila().getNext();
        atualizaCaixa();
        this.disponivel = false;
        PanelSimulacao.atualizarClientes();
        this.disponivel = true;
        System.out.println("Encaminhando pedido para o entregador.");
        atualizaCaixa();
        //CaixaPagamento.getFila().addCliente(cliente);
        //System.out.println(CaixaPagamento.getFila().getFila().size());
        return true;
    }

    public synchronized void run()
    {
        while(true) {

            try
            {
                sem.acquire();
            } catch (InterruptedException e)
            {
            }
            if (this.disponivel && !(this.fila.getFila().size() == 0)) {
                atende();
                waitAtendimento();
                PanelSimulacao.esvaziarCozinheiro(this.id);
            }
            sem.release();
        }
    }
}
