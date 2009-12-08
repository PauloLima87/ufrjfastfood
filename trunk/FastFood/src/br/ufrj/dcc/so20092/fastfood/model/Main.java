package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.util.concurrent.Semaphore;

public class Main {
    
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Cardapio cardapio = new Cardapio();

        final int numeroCaixasAtendimento = 3;
        final int numeroCaixasPagamento = 3;
        final int numeroCozinheiros = 3;
        Semaphore semCaixasAtendimento = new Semaphore(numeroCaixasAtendimento, true);
        Semaphore semCaixasPagamento = new Semaphore(numeroCaixasPagamento, true);
        Semaphore semCozinheiro = new Semaphore(numeroCozinheiros, true);

        CaixaAtendimento caixasAtendimento[] = new CaixaAtendimento[numeroCaixasAtendimento];
        CaixaPagamento caixasPagamento[] = new CaixaPagamento[numeroCaixasPagamento];
        Cozinheiro cozinheiros[] = new Cozinheiro[numeroCozinheiros];

        FilaAtendimento filaAtendimento = new FilaAtendimento();
        FilaPagamento filaPagamento = new FilaPagamento();
        FilaCozinheiro filaCozinheiro = new FilaCozinheiro();
        CaixaAtendimento.setFila(filaAtendimento);
        CaixaPagamento.setFila(filaPagamento);
        Cozinheiro.setFila(filaCozinheiro);

        for (int i = 0; i < numeroCaixasAtendimento; i++)
        {
            caixasAtendimento[i] = new CaixaAtendimento(i, semCaixasAtendimento);
            caixasAtendimento[i].start();
        }
        
        for (int i = 0; i < numeroCaixasPagamento; i++)
        {
            caixasPagamento[i] = new CaixaPagamento(i, semCaixasPagamento);
            caixasPagamento[i].start();
        }

        for (int i = 0; i < numeroCozinheiros; i++)
        {
            cozinheiros[i] = new Cozinheiro(i, semCozinheiro);
            cozinheiros[i].start();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaPrincipal t = new TelaPrincipal();
                    t.setVisible(true);
                    t.setSize(1300, 1000);

                } catch (Exception e) {
                }
            }
        });
    }
}