

import java.awt.BorderLayout;


import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class TelaPrincipal2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBar menu = new JMenuBar();

        public TelaPrincipal2() {
		super("UFRJ Fast Food");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.montaMenu();
	}

	public void montaMenu() {
		JMenu pedido = new JMenu("Pedido");
		pedido.add(new JMenuItem("Fazer Pedido"));
		pedido.add(new JMenuItem("Pagar Pedido"));
		pedido.add(new JMenuItem("Consultar Pedido"));
		menu.add(pedido);
		this.setJMenuBar(menu);
	}
}
