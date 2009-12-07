package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.util.concurrent.Semaphore;

public class Main {
    
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        final int numeroCaixasAtendimento = 3;
        final int numeroCaixasPagamento = 3;
        Semaphore semCaixasAtendimento = new Semaphore(numeroCaixasAtendimento, true);
        Semaphore semCaixasPagamento = new Semaphore(numeroCaixasPagamento, true);

        CaixaAtendimento caixasAtendimento[] = new CaixaAtendimento[numeroCaixasAtendimento];
        CaixaPagamento caixasPagamento[] = new CaixaPagamento[numeroCaixasPagamento];
        System.out.println("c");

        FilaAtendimento filaAtendimento = new FilaAtendimento();
        FilaPagamento filaPagamento = new FilaPagamento();
        CaixaAtendimento.setFila(filaAtendimento);
        CaixaPagamento.setFila(filaPagamento);

        for (int i = 0; i < numeroCaixasAtendimento; i++)
        {
            caixasAtendimento[i] = new CaixaAtendimento(i, semCaixasAtendimento);
            caixasAtendimento[i].start();
        }
        /*
        for (int i = 0; i < numeroCaixasPagamento; i++)
        {
            caixasPagamento[i] = new CaixaPagamento(i, semCaixasPagamento);
            caixasPagamento[i].start();
        }*/
    }
}