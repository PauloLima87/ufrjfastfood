package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.CaixaAtendimento;
import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;
import br.ufrj.dcc.so20092.fastfood.model.ItemPedido;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
import br.ufrj.dcc.so20092.fastfood.model.Pedido;
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

    private void trocaForm(JPanel novoPainel) {
	this.getContentPane().setVisible(false);
	this.setContentPane(novoPainel);
	novoPainel.setVisible(true);
    }

    private void criaMenu() {
        menu = new JMenuBar();
        cliente = new JMenuItem();
        cliente.setText("Adicionar Cliente");
        cliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.out.println("aaaaabbbbbb");
                trocaForm(new NewJPanel());
                clicouCliente();
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
        relatorio.setText("Relatório");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        fila1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        fila2 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        fila3 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        clientesRestantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 1300, 800));
        setMaximizedBounds(new java.awt.Rectangle(10, 10, 600, 500));
        setName("UFRJ Fast Food"); // NOI18N
        setResizable(false);

        jLabel1.setText("Caixa Atendimento 1");

        jLabel2.setText("Caixa Atendimento 2");

        jLabel3.setText("Caixa Atendimento 3");

        jButton1.setText("Adicionar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Fila");

        jLabel5.setText("clientes restantes na fila");

        jLabel6.setText("ATENDIMENTO");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        fila1.setColumns(20);
        fila1.setRows(5);
        jScrollPane6.setViewportView(fila1);

        fila2.setColumns(20);
        fila2.setRows(5);
        jScrollPane7.setViewportView(fila2);

        fila3.setColumns(20);
        fila3.setRows(5);
        jScrollPane8.setViewportView(fila3);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane9.setViewportView(jTextArea9);

        clientesRestantes.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(84, 84, 84)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(clientesRestantes))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(jButton1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(812, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(clientesRestantes)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão adicionar cliente
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente cliente = new Cliente();
        FilaAtendimento fa = CaixaAtendimento.getFila();
        fa.addCliente(cliente);        
        String pedido = "";
        Integer i = 0;
        Integer j = 0;
        for(Cliente c : fa.getFila()){
            i++;
            HashSet<ItemPedido> itensPedido = c.getPedido().getItem();
            for (ItemPedido item : itensPedido) {
                String produto = item.getProduto().getNome();
                Integer quantidade = item.getQuantidade();
                pedido += produto+" - " + quantidade + "\n";
            }
            if (i == 1) {
                j++;
                fila1.setText(pedido);
            } else if (i == 2) {
                j++;
                fila2.setText(pedido);
            } else if ( i == 3 ) {
                j++;
                fila3.setText(pedido);
            }
            pedido = "";
        }
        String s = String.valueOf(fa.getFila().size() - j);
        getClientesRestantes().setText(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {
        trocaForm(new PanelEstoque());
        System.out.println("aaaaa");
    }

    public void clicouCliente() {
        Cliente cliente = new Cliente();
        /*

        Cliente cliente = new Cliente();
        //FilaAtendimento fila = new FilaAtendimento();
        FilaAtendimento.addClienteFilaGlobal(cliente);
        System.out.println(FilaAtendimento.getClienteFilaGlobal().getPedido().getValorTotal());
         */
    }

    public void clicouEstoque() {
        trocaForm(new PanelEstoque());
    }

    public void clicouRelatorio() {

    }

    public void clicouSobre() {

    }

    public void clicouSair() {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clientesRestantes;
    private javax.swing.JTextArea fila1;
    private javax.swing.JTextArea fila2;
    private javax.swing.JTextArea fila3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea9;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTextArea1
     */
    public javax.swing.JTextArea getjTextArea1() {
        return jTextArea1;
    }

    /**
     * @param jTextArea1 the jTextArea1 to set
     */
    public void setjTextArea1(javax.swing.JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }


    /**
     * @return the jTextArea4
     */
    public javax.swing.JTextArea getjTextArea4() {
        return jTextArea4;
    }

    /**
     * @param jTextArea4 the jTextArea4 to set
     */
    public void setjTextArea4(javax.swing.JTextArea jTextArea4) {
        this.jTextArea4 = jTextArea4;
    }

    /**
     * @return the jTextArea5
     */
    public javax.swing.JTextArea getjTextArea5() {
        return jTextArea5;
    }

    /**
     * @param jTextArea5 the jTextArea5 to set
     */
    public void setjTextArea5(javax.swing.JTextArea jTextArea5) {
        this.jTextArea5 = jTextArea5;
    }

    /**
     * @return the jTextArea6
     */
    public javax.swing.JTextArea getjTextArea6() {
        return fila1;
    }

 
    /**
     * @return the jTextArea7
     */
    public javax.swing.JTextArea getjTextArea7() {
        return fila2;
    }

    /**
     * @return the jTextArea8
     */
    public javax.swing.JTextArea getjTextArea8() {
        return fila3;
    }

    /**
     * @return the jTextArea8
     */
    public javax.swing.JTextArea getjTextArea9() {
        return jTextArea9;
    }

    /**
     * @param jTextArea8 the jTextArea8 to set
     */
    public void setjTextArea9(javax.swing.JTextArea jTextArea9) {
        this.jTextArea9 = jTextArea9;
    }

    /**
     * @return the clientesRestantes
     */
    public javax.swing.JLabel getClientesRestantes() {
        return clientesRestantes;
    }

    /**
     * @param clientesRestantes the clientesRestantes to set
     */
    public void setClientesRestantes(javax.swing.JLabel clientesRestantes) {
        this.clientesRestantes = clientesRestantes;
    }


}
