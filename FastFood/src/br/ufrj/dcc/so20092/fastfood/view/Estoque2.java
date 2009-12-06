package br.ufrj.dcc.so20092.fastfood.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Estoque2 extends JPanel {
    String[] colunas = {"Ingrediente", "Quantidade"};
    Object[][] dados = {{"aaa", "bb"}};
    
    public Estoque2() {
        JTable tabela = new JTable(dados, colunas);
  //      JScrollPane scrollPane = new JScrollPane(tabela);
        tabela.setFillsViewportHeight(true);
        this.add(tabela);
    }
}
