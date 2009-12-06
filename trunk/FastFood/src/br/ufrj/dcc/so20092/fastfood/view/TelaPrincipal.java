package br.ufrj.dcc.so20092.fastfood.view;

import br.ufrj.dcc.so20092.fastfood.model.Cliente;
import br.ufrj.dcc.so20092.fastfood.model.FilaAtendimento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 1300, 800));
        setMaximizedBounds(new java.awt.Rectangle(10, 10, 600, 500));
        setName("UFRJ Fast Food"); // NOI18N
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        trocaForm(new Estoque());
        System.out.println("aaaaa");
    }

    public void clicouCliente() {
        Cliente cliente = new Cliente();
        FilaAtendimento fila = new FilaAtendimento();
        fila.addClienteFilaGlobal(cliente);
        System.out.println(fila.getClienteFilaGlobal().getPedido().getValorTotal());
    }

    public void clicouEstoque() {
        System.out.println("veio");
        trocaForm(new Estoque2());
    }

    public void clicouRelatorio() {

    }

    public void clicouSobre() {

    }

    public void clicouSair() {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
