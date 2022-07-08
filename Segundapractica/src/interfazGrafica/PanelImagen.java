
package interfazGrafica;


import javax.swing.*;
import java.awt.*;

import Modelo.*;

public class PanelImagen extends JPanel {
	private Imagen imagen;
	private Font fuente;
		
	public PanelImagen(Imagen imagen) {
    	this.imagen = imagen;
		this.repaint();
	}
	
	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
		repaint();
	}
		
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (this.imagen == null) {
			this.fuente = new Font("TimesRoman", Font.BOLD, 36);
			g.setFont(fuente);
			g.setColor(Color.RED);
			g.drawString("Visor de Imagen", 150, 300);
		}else {
			g.drawImage(imagen.getImagen(), 10, 20,getWidth()-10, getHeight()-10, null);
        }
	}

}
