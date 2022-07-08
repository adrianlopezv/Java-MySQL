package interfazGrafica;

import java.awt.event.*;
import java.io.*;


import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;

import modelo.Imagen;
import utilerias.*;
import indexado.ManejadorArchivo;

public class PanelDatos extends JPanel {
	private JLabel nombreLabel, apPaternoLabel, apMaternoLabel, edadLabel, imagenLabel;
	private JTextField nombreTextField, apPaternoTextField, apMaternoTextField, edadTextField, imagenTextField;
	
	private JButton crearButton, cambiarButton, borrarButton, archivoButton, buscarButton;
	
	private JPanel buscarPanel, nombrePanel, apPaternoPanel, apMaternoPanel, edadPanel, imagenPanel, comandoPanel;
	
	private FramePrincipal miFrame;
	private PanelImagen panelImagen;
	
	private RandomAccessFile manejador;
	private PanelDatos panelDatos;
	private long posicionRegistro;
	
	public PanelDatos(FramePrincipal miFrame, PanelImagen panelImagen, RandomAccessFile manejador) {
		this.miFrame = miFrame;
		this.panelImagen = panelImagen;
		this.panelDatos = this;
		
		this.manejador = manejador;
		
		this.nombreLabel = new JLabel("Nombre: ");
		this.apPaternoLabel = new JLabel("Apellido Paterno: ");
		this.apMaternoLabel = new JLabel("Apellido Materno: ");
		this.edadLabel = new JLabel("Edad: ");
		this.imagenLabel = new JLabel("Imagen: ");
		
		this.nombreTextField = new JTextField(30);
		this.apPaternoTextField = new JTextField(30);
		this.apMaternoTextField = new JTextField(30);
		this.edadTextField = new JTextField(3);
		this.imagenTextField = new JTextField(30);
		
		this.buscarButton = new JButton("Buscar Registro");
		this.crearButton = new JButton(new ImageIcon("iconos//crearRegistro2.png"));
		this.crearButton.setActionCommand("Crear Registro");
		this.cambiarButton = new JButton(new ImageIcon("iconos//cambiarRegistro2.png"));
		this.cambiarButton.setActionCommand("Modificar Registro");
		this.borrarButton = new JButton(new ImageIcon("iconos//borrarRegistro2.png"));
		this.borrarButton.setActionCommand("Borrar Registro");
		this.archivoButton = new JButton(new ImageIcon("iconos//cargarArchivo2.png"));
		
		this.nombrePanel = new JPanel();
		this.nombrePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.apPaternoPanel = new JPanel();
		this.apPaternoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.apMaternoPanel = new JPanel();
		this.apMaternoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.edadPanel = new JPanel();
		this.edadPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.imagenPanel = new JPanel();
		this.imagenPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.comandoPanel = new JPanel();
		this.buscarPanel = new JPanel();
		this.buscarPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
	
	public void presentarPanelDatos() {		
		this.nombrePanel.add(this.nombreLabel);
		this.nombrePanel.add(this.nombreTextField);
		
		this.apPaternoPanel.add(this.apPaternoLabel);
		this.apPaternoPanel.add(this.apPaternoTextField);
		
		this.apMaternoPanel.add(this.apMaternoLabel);
		this.apMaternoPanel.add(this.apMaternoTextField);
		
		this.edadPanel.add(this.edadLabel);
		this.edadPanel.add(this.edadTextField);
		
		this.imagenPanel.add(this.imagenLabel);
		this.imagenPanel.add(this.imagenTextField);
		this.imagenPanel.add(this.archivoButton);
		
		this.comandoPanel.add(this.crearButton);
		this.comandoPanel.add(this.cambiarButton);
		this.cambiarButton.setEnabled(false);
		this.comandoPanel.add(this.borrarButton);
		this.borrarButton.setEnabled(false);
		
		this.buscarPanel.add(this.buscarButton);
		this.buscarButton.setEnabled(false);
		
		this.setLayout(new GridLayout(7, 1, 1,1));
		this.add(nombrePanel);
		this.add(this.apPaternoPanel);
		this.add(this.apMaternoPanel);
		this.add(this.buscarPanel);
		this.add(this.edadPanel);
		this.add(this.imagenPanel);
		this.add(this.comandoPanel);
		
		this.archivoButton.addActionListener(new ActionHandler());
		this.crearButton.addActionListener(new ComandoHandler());
		this.cambiarButton.addActionListener(new ComandoHandler());
		this.borrarButton.addActionListener(new ComandoHandler());
		this.buscarButton.addActionListener(new ComandoHandler());
		
	}
	

	public  String getNombre() {
		return this.nombreTextField.getText().trim();
	}
	
	public void setNombre(String nombre) {
		this.nombreTextField.setText(nombre);
	}

	public String getApPaterno() {
		return this.apPaternoTextField.getText().trim();
	}
	
	public void setApPaterno(String apPaterno) {
		this.apPaternoTextField.setText(apPaterno);
	}

	public String getApMaterno() {
		return this.apMaternoTextField.getText().trim();
	}
	
	public void setApMaterno(String apMaterno) {
		this.apMaternoTextField.setText(apMaterno);
	}

	public String getEdad() {
		return this.edadTextField.getText().trim();
	}
	
	public void setEdad(String edad) {
		this.edadTextField.setText(edad);
	}

	public String getImagen() {
		return this.imagenTextField.getText().trim();
	}
	
	public void setImagen(String imagen) {
		this.imagenTextField.setText(imagen);
		if(imagen.equals(" ")) {
			panelImagen.setImagen(null);
		}else {
			panelImagen.setImagen(new Imagen(imagen));
	    }
	}
	
	public void limpiarTextField() {
		this.setNombre(" ");
		this.setApPaterno(" ");
		this.setApMaterno(" ");
		this.setEdad(" ");
		this.setImagen(" ");
	}

	public void crearRegistro() {
		this.buscarButton.setEnabled(false);
		this.crearButton.setEnabled(true);
		this.cambiarButton.setEnabled(false);
		this.borrarButton.setEnabled(false);
				
		this.limpiarTextField();
	}
	
	public void cambiarRegistro() {
		this.buscarButton.setEnabled(true);
		this.crearButton.setEnabled(false);
		this.cambiarButton.setEnabled(true);
		this.borrarButton.setEnabled(false);
		
		this.limpiarTextField();
	}
	
	public void borrarRegistro() {
		this.buscarButton.setEnabled(true);
		this.crearButton.setEnabled(false);
		this.cambiarButton.setEnabled(false);
		this.borrarButton.setEnabled(true);
		
		this.limpiarTextField();
	}

	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JFileChooser chooser = new JFileChooser();
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & PNG Images", "jpg", "png");
		    chooser.setFileFilter(filter);
		    int returnVal = chooser.showOpenDialog(miFrame);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		       System.out.println("You chose to open this file: " +
		            chooser.getSelectedFile().getPath());
		       panelImagen.setImagen(new Imagen(chooser.getSelectedFile().getPath()));
		       imagenTextField.setText(chooser.getSelectedFile().getPath());
		    }
		}
	}
	
	public class ComandoHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Crear Registro")) {
				//Aqui llamar a Manejador de Archivo Indexado con lógica para dar de alta un registro en el archivo
				//y llenar datos de PanelDatos con métodos set y get de PanelDatos

				limpiarTextField();
			}else if(e.getActionCommand().equals("Modificar Registro")) {
				//Aqui llamar a Manejador de Archivo Indexado con lógica para  modificar un registro en el archivo
				//y llenar datos de PanelDatos con métodos set y get de PanelDatos

				limpiarTextField();
			}else if(e.getActionCommand().equals("Borrar Registro")) {
				//Aqui llamar a Manejador de Archivo Indexado con lógica para borrar un registro en el archivo
				//y llenar datos de PanelDatos con métodos set y get de PanelDatos

				limpiarTextField();
			}else if(e.getActionCommand().equals("Buscar Registro")) {
				//Aqui llamar a Manejador de Archivo Indexado con lógica para buscar un registro en el archivo
				//y llenar datos de PanelDatos con métodos set y get de PanelDatos

			}
		}
	}

}
