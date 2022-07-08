package interfazGrafica;

import java.io.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import indexado.ManejadorArchivo;
import modelo.Imagen;
import utilerias.*;



public class FramePrincipal extends JFrame {
	private PanelDatos panelDatos;
	private PanelImagen panelImagen;
	
	private JRadioButton crearRadioButton, cambiarRadioButton, borrarRadioButton;
	private ButtonGroup radioGroup;
	private JPanel panelComandos, panelCentral, panelBoton, panelNorte;
	
	private RandomAccessFile manejador;
	
	
	public FramePrincipal() {
		super("Manejo de Archivos");
		
		//Manejador de Archivo Indexado
		manejador = ManejadorArchivo.abrirArchivo("usuarios2.txt");
				
		panelImagen = new PanelImagen(null);
		panelDatos = new PanelDatos(this, this.panelImagen, this.manejador);
				
		this.crearRadioButton = new JRadioButton("Crear Usuario", true);
		this.cambiarRadioButton = new JRadioButton("Modificar Usuario", false);
		this.borrarRadioButton = new JRadioButton("Borrar Usuario", false);
		
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
		this.panelCentral.add(this.panelImagen);
		
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
		FramePrincipal framePrincipal = new FramePrincipal();
		framePrincipal.presentarFramePrincipal();
	}
	
	private class RadioButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Crear Usuario")) {
				panelDatos.crearRegistro();
			}else if(e.getActionCommand().equals("Modificar Usuario")) {
				panelDatos.cambiarRegistro();
			}else if(e.getActionCommand().equals("Borrar Usuario")) {
				panelDatos.borrarRegistro();
			}
		}
	}
}
