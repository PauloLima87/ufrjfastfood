package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.util.concurrent.Semaphore;

public class Main {
    
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        TelaPrincipal t = new TelaPrincipal();
        t.setVisible(true);

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