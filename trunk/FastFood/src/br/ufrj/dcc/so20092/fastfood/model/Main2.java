package br.ufrj.dcc.so20092.fastfood.model;

import br.ufrj.dcc.so20092.fastfood.view.TelaPrincipal;
import java.util.concurrent.Semaphore;

public class Main2 {
    
    public static void main(String[] args) {
        TelaPrincipal t = new TelaPrincipal();
        t.setVisible(true);

        final int numeroCaixasAtendimento = 3;
        Semaphore sem = new Semaphore(numeroCaixasAtendimento, true);

        CaixaAtendimento p[] = new CaixaAtendimento[numeroCaixasAtendimento];

        for (int i = 0; i < numeroCaixasAtendimento; i++)
        {
            FilaAtendimento filaAtendimento = new FilaAtendimento();
            CaixaAtendimento.setFila(filaAtendimento);
            p[i] = new CaixaAtendimento(i, sem);
            p[i].start();
        }
    }
}