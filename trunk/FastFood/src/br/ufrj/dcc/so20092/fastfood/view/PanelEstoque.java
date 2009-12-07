package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.Estoque;
import br.ufrj.dcc.so20092.fastfood.model.ItemEstoque;
import java.util.Iterator;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class PanelEstoque extends javax.swing.JPanel {
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private String[][] linhas;
    
    public PanelEstoque() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        linhas = new String[Estoque.itensEstoque.size()][3];

        Integer i = 0;
        for (ItemEstoque ie : Estoque.itensEstoque) {
          linhas[i][0] = ie.getIngrediente().getNome();
          linhas[i][1] = ie.getQuantidade().toString();
          linhas[i][2] = ie.getIngrediente().getUnidade();
            i++;
        }

        DefaultTableModel dtm = new javax.swing.table.DefaultTableModel(linhas, new String[] {"Ingrediente", "Quantidade", "Unidade"});
        jTable1.setModel(dtm);

        dtm.addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                Integer linha = e.getLastRow();
                Integer coluna = e.getColumn();
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                if (coluna == 0) {
                    for(ItemEstoque ie : Estoque.itensEstoque) {
                        if (linhas[linha][0].equalsIgnoreCase(ie.getIngrediente().getNome())) {
                            ie.getIngrediente().setNome(dtm.getValueAt(linha, 0).toString());
                            for (ItemEstoque ie2 : Estoque.itensEstoque) {
                                System.out.println(ie2.getIngrediente().getNome());
                            }
                            return;
                        }
                    }

                }
                if (coluna == 1) {
                    for(ItemEstoque ie : Estoque.itensEstoque) {
                        if (ie.getIngrediente().getNome() == dtm.getValueAt(linha, 0)) {
                            ie.setQuantidade(Integer.parseInt(dtm.getValueAt(linha, 1).toString()));
                            for (ItemEstoque ie2 : Estoque.itensEstoque) {
                                System.out.println(ie2.getQuantidade());
                            }
                            return;
                        }
                    }
                }
            }
        });

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