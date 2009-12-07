package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class Main {
    
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    //e.printStackTrace();
                }
            }
        });

        final int numeroCaixasAtendimento = 3;
        Semaphore sem = new Semaphore(numeroCaixasAtendimento, true);

        CaixaAtendimento caixas[] = new CaixaAtendimento[numeroCaixasAtendimento];

        for (int i = 0; i < numeroCaixasAtendimento; i++)
        {
            FilaAtendimento filaAtendimento = new FilaAtendimento();
            CaixaAtendimento.setFila(filaAtendimento);
            caixas[i] = new CaixaAtendimento(i, sem);
            caixas[i].start();
        }
    }
}