/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaEstoque.java
 *
 * Created on 05/12/2009, 22:33:39
 */

package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.Cardapio;
import br.ufrj.dcc.so20092.fastfood.model.Estoque;
import br.ufrj.dcc.so20092.fastfood.model.ItemEstoque;
import java.util.HashSet;
import javax.swing.JButton;

/**
 *
 * @author Pablo
 */
public class TelaEstoque extends javax.swing.JPanel {

    private Estoque estoque = new Estoque();

    /** Creates new form TelaEstoque */
    public TelaEstoque() {
        initComponents();
        mostraListaIngredientes();
    }

    private void mostraListaIngredientes(){
        for(ItemEstoque item_estoque : estoque.getItemEstoque()){
            // Trocar para exibir na tela
            /*JButton adicionar = new JButton("Adicionar");
            adicionar.addActionListener(new AgasalhosListener());
            panel4.add(agasalhos);*/
            System.out.println(item_estoque.getIngrediente().getNome());
            System.out.println(item_estoque.getQuantidade());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        textField1 = new java.awt.TextField();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setText("Ingrediente");

        jLabel2.setText("Quantidade");

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        textField1.setText("khbjh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

}
