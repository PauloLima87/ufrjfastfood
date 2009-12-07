package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.CaixaAtendimento;
import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;
import br.ufrj.dcc.so20092.fastfood.model.ItemPedido;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {
    private JPanel telaPedido = null;

    private JMenuBar menu = null;

    private JMenuItem cliente = null;
    private JMenuItem estoque = null;
    private JMenuItem relatorio = null;
    private JMenuItem sobre = null;
    private JMenuItem sair = null;

    /** Creates new form NewJFrame */
    public TelaPrincipal() {
        criaMenu();
        initComponents();
        
    }

    public void trocaForm(JPanel novoPainel) {
	this.getContentPane().setVisible(false);
	this.setContentPane(novoPainel);
	novoPainel.setVisible(true);
    }

    public void criaMenu() {
        menu = new JMenuBar();
        cliente = new JMenuItem();
        cliente.setText("Simulação");
        cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicouSimulacao();
            }
        });
        menu.add(cliente);
        estoque = new JMenuItem();
        estoque.setText("Gerir Estoque");
        estoque.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicouEstoque();
            }
        });
        menu.add(estoque);
        relatorio = new JMenuItem();
        relatorio.setText("Relatórios");
        relatorio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicouRelatorio();
            }
        });
        menu.add(relatorio);
        sobre = new JMenuItem();
        sobre.setText("Sobre");
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicouSobre();
            }
        });
        menu.add(sobre);
        sair = new JMenuItem();
        sair.setText("Sair");
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicouSair();
            }
        });
        menu.add(sair);        
        setJMenuBar(menu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 1300, 800));
        setMaximizedBounds(new java.awt.Rectangle(10, 10, 600, 500));
        setName("UFRJ Fast Food"); // NOI18N
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(671, 671, 671)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(174, 174, 174)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão adicionar cliente
    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {
        trocaForm(new PanelEstoque());
    }

    public void clicouSimulacao() {
        trocaForm(new PanelSimulacao());
    }

    public void clicouEstoque() {
        trocaForm(new PanelEstoque());
    }

    public void clicouRelatorio() {
        trocaForm(new ViewRelatorio());
    }

    public void clicouSobre() {

    }

    public void clicouSair() {
        System.exit(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
