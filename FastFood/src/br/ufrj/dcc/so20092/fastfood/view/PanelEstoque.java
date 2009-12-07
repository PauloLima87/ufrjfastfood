package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.Estoque;
import br.ufrj.dcc.so20092.fastfood.model.ItemEstoque;

public class PanelEstoque extends javax.swing.JPanel {
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

    public PanelEstoque() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        String[][] linhas = new String[Estoque.itensEstoque.size()][2];

        Integer i = 0;
        for (ItemEstoque ie : Estoque.itensEstoque) {
          linhas[i][0] = ie.getIngrediente().getNome();
            linhas[i][1] = ie.getQuantidade().toString();
            i++;
        }

        jTable1.setModel(new javax.swing.table.DefaultTableModel(linhas, new String[] {"Ingrediente", "Quantidade", "Unidade"}));

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }
}