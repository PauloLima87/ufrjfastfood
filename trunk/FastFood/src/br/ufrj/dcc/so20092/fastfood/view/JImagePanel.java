package br.ufrj.dcc.so20092.fastfood.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * A panel that contains a background image. The background image is
 * automatically sized to fit in the panel.
 */
public class JImagePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	BufferedImage background = null;

	public JImagePanel(BufferedImage img) {
		if (img == null)
			throw new NullPointerException("Buffered image cannot be null!");
		this.background = img;
	}

	public JImagePanel(File imgSrc) throws IOException {
		this(ImageIO.read(imgSrc));
	}

	public JImagePanel(String fileName) throws IOException{
		this(new File(fileName));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d
				.drawImage(background, 0, 0, this.getWidth(), this.getHeight(),
						null);
		g2d.dispose();
	}
}