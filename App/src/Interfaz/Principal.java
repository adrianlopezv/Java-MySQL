/*
PRACTICA
GOMEZ VARGAS MARIA ISABEL
LOPEZ VUDOYRA ADRIAN
25/10/18
*/
package Interfaz;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Utilerias.*;

public class Principal extends JFrame {
	private PanelDatos panelDatos;
	
	private JRadioButton crearRadioButton, cambiarRadioButton, borrarRadioButton;
	private ButtonGroup radioGroup;
	private JPanel panelComandos, panelCentral, panelBoton, panelNorte;
        private ListaSimple lista = new ListaSimple();
	
	
	
	public Principal() {
		super("Manejo de Producto");
                //super("Manejo de Archivos");
				
		panelDatos = new PanelDatos(this,this.lista);
				
		this.crearRadioButton = new JRadioButton("Dar de alta producto", true);
		this.cambiarRadioButton = new JRadioButton("Modificar Producto", false);
		this.borrarRadioButton = new JRadioButton("Borrar Producto", false);
		
		this.radioGroup = new ButtonGroup();
		this.radioGroup.add(this.crearRadioButton);
		this.radioGroup.add(this.cambiarRadioButton);
		this.radioGroup.add(this.borrarRadioButton);
				
		this.panelBoton = new JPanel();
		this.panelComandos = new JPanel();
		this.panelNorte = new JPanel();
		this.panelNorte.setLayout(new GridLayout(1, 2, 2, 2));
		this.panelCentral = new JPanel();
		this.panelCentral.setLayout(new GridLayout(1, 2, 2, 2));		
	}
	
	public void presentarFramePrincipal() {
		this.setSize(1050, 750);
		
		this.panelComandos.add(this.crearRadioButton);
		this.panelComandos.add(this.cambiarRadioButton);
		this.panelComandos.add(this.borrarRadioButton);
				
		this.panelNorte.add(this.panelComandos);
		this.panelNorte.add(this.panelBoton);
		
		this.panelCentral.add(this.panelDatos);
		this.panelDatos.presentarPanelDatos();
		
		this.add(panelNorte, BorderLayout.NORTH );
		this.add(panelCentral, BorderLayout.CENTER );
		this.add(new JPanel(), BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.crearRadioButton.addActionListener(new RadioButtonHandler());
		this.cambiarRadioButton.addActionListener(new RadioButtonHandler());
		this.borrarRadioButton.addActionListener(new RadioButtonHandler());
	}
	
	
	public static void main(String args[]) {
		Principal framePrincipal = new Principal();
		framePrincipal.presentarFramePrincipal();
	}
	
	private class RadioButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Dar de alta producto")) {
				panelDatos.crearRegistro();
			}else if(e.getActionCommand().equals("Modificar Producto")) {
				panelDatos.cambiarRegistro();
			}else if(e.getActionCommand().equals("Borrar Producto")) {
				panelDatos.borrarRegistro();
			}
		}
	}
}