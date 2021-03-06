package Interfaz;

import java.awt.event.*;
import java.io.*;


import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;

import Modelo.*;
import Utilerias.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PanelDatos extends JPanel {
	private JLabel nombreLabel, precioLabel, claveLabel;
	private JTextField nombreTextField, precioTextField, claveTextField;
	
	private JButton AltaButton, cambiarButton, borrarButton ,buscarButton;;//, archivoButton,
	
	private JPanel buscarPanel, nombrePanel, precioPanel, clavePanel, comandoPanel;
	
	private Principal miFrame;
        private ListaSimple lista;
	
	private ListaSimple ListaProd=new ListaSimple();
	private RandomAccessFile manejador;
	private PanelDatos panelDatos;
	private long posicionRegistro;
        Nodo NodoBuscar=new Nodo();
	
	public PanelDatos(Principal miFrame, ListaSimple lista) {
		this.miFrame = miFrame;
		this.panelDatos = this;
		
//		this.manejador = manejador; se tendria que mandar la lista
		
		this.claveLabel = new JLabel("Clave Producto: ");
                this.nombreLabel = new JLabel("Nombre Producto: ");
		this.precioLabel = new JLabel("Precio Producto: ");
		
		
		this.claveTextField = new JTextField(30);
		this.nombreTextField = new JTextField(30);
		this.precioTextField = new JTextField(3);
		
		this.buscarButton = new JButton("Buscar Producto");
		this.AltaButton =  new JButton(new ImageIcon("C:\\Users\\adria\\Documents\\Archivos Ad\\5 semestre\\Introduccionaarchivosybases\\Segundapractica\\src\\iconos\\crearRegistro2.png"));
		this.AltaButton.setActionCommand("Dar de alta producto");
		this.cambiarButton = new JButton(new ImageIcon("C:\\Users\\adria\\Documents\\Archivos Ad\\5 semestre\\Introduccionaarchivosybases\\Segundapractica\\src\\iconos\\cambiarRegistro2.png"));
		this.cambiarButton.setActionCommand("Modificar Producto");
		this.borrarButton =new JButton(new ImageIcon("C:\\Users\\adria\\Documents\\Archivos Ad\\5 semestre\\Introduccionaarchivosybases\\Segundapractica\\src\\iconos\\borrarRegistro2.png"));
		this.borrarButton.setActionCommand("Borrar Producto");
		                
		this.clavePanel = new JPanel();
		this.clavePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.nombrePanel = new JPanel();
		this.nombrePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.precioPanel = new JPanel();
		this.precioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.comandoPanel = new JPanel();
		this.buscarPanel = new JPanel();
		this.buscarPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	}
	
	public void presentarPanelDatos() {	
                this.clavePanel.add(this.claveLabel);
		this.clavePanel.add(this.claveTextField);
                
		this.nombrePanel.add(this.nombreLabel);
		this.nombrePanel.add(this.nombreTextField);
		
		this.precioPanel.add(this.precioLabel);
		this.precioPanel.add(this.precioTextField);
		
		this.comandoPanel.add(this.AltaButton);
		this.comandoPanel.add(this.cambiarButton);
		this.cambiarButton.setEnabled(false);
		this.comandoPanel.add(this.borrarButton);
		this.borrarButton.setEnabled(false);
		
		this.buscarPanel.add(this.buscarButton);
		this.buscarButton.setEnabled(false);
		
		this.setLayout(new GridLayout(7, 1, 1,1));
		this.add(this.clavePanel);
                this.add(nombrePanel);
		this.add(this.precioPanel);
		this.add(this.buscarPanel);
		this.add(this.comandoPanel);
		
		this.AltaButton.addActionListener(new ComandoHandler());
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

	public int getPrecio() {
		return Integer.parseInt(this.precioTextField.getText().trim());
	}
	
	public void setPrecio(String precio) {
		this.precioTextField.setText(precio);
	}
        
	public String getClave() {
		return this.claveTextField.getText().trim();
	}
	
	public void setClave(String edad) {
		this.claveTextField.setText(edad);
	}
	
	public void limpiarTextField() {
		this.setNombre(" ");
		this.setPrecio(" ");
		this.setClave(" ");
	}

	public void crearRegistro() {
		this.buscarButton.setEnabled(false);
		this.AltaButton.setEnabled(true);
		this.cambiarButton.setEnabled(false);
		this.borrarButton.setEnabled(false);
				
		this.limpiarTextField();
	}
	
	public void cambiarRegistro() {
		this.buscarButton.setEnabled(true);
		this.AltaButton.setEnabled(false);
		this.cambiarButton.setEnabled(true);
		this.borrarButton.setEnabled(false);
		
		this.limpiarTextField();
	}
	
	public void borrarRegistro() {
		this.buscarButton.setEnabled(true);
		this.AltaButton.setEnabled(false);
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
		    }
		}
	}
	
	public class ComandoHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
                    
                    
                    Nodo nodo=new Nodo();
                    String NombreProd,ClaveProd;
                    int PrecioProd;
			if(e.getActionCommand().equals("Dar de alta producto")) {
                            Producto producto=new Producto();
				 NombreProd= panelDatos.getNombre();
                                    producto.setNombreProducto(NombreProd);
                            ///////////////////////////////////////////////
                            ClaveProd=panelDatos.getClave();
                            producto.setClaveProd(ClaveProd);
                            //////////////////////////////////////////////////
                            PrecioProd=panelDatos.getPrecio();
                            producto.setPrecioProd(PrecioProd);
                            //////////////////////////////////////////////////
                         nodo.setInfoProducto(producto);
                            ListaProd.insertarFinal(nodo);
                        
				limpiarTextField();
                                System.out.println(ListaProd.toString());
                                
                                /////////////////////////////////////////////////////////////////////////////////////////////
			}else if(e.getActionCommand().equals("Modificar Producto")) {
                            Producto producto=new Producto();
                            
				 NombreProd=panelDatos.getNombre();
                                 producto.setNombreProducto(NombreProd);
                                 
            ////////////////////////////////////////////////////////////////////////
            
                                ClaveProd=panelDatos.getClave(); 
                                producto.setClaveProd(ClaveProd);
                        
           //////////////////////////////////////////////////////////////////////////
                                PrecioProd=panelDatos.getPrecio();
                                 producto.setPrecioProd(PrecioProd);
                        
                    
                            nodo.setInfoProducto(producto);
                            ListaProd.Modificar(NodoBuscar,nodo);
                      
                            limpiarTextField();
                            
                            
                            
			}else if(e.getActionCommand().equals("Borrar Producto")) {
				   Producto producto=new Producto();
                            
				 NombreProd=panelDatos.getNombre();
                                 producto.setNombreProducto(NombreProd);
                                 
            ////////////////////////////////////////////////////////////////////////
            
                                ClaveProd=panelDatos.getClave(); 
                                producto.setClaveProd(ClaveProd);
                        
           //////////////////////////////////////////////////////////////////////////
                                PrecioProd=panelDatos.getPrecio();
                                 producto.setPrecioProd(PrecioProd);
                        
                    
                            NodoBuscar.setInfoProducto(producto);
                            ListaProd.borrarDespuesde(NodoBuscar);

				limpiarTextField();
                                System.out.println(ListaProd.toString());
                                
			}else if(e.getActionCommand().equals("Buscar Producto")) {
			Producto producto=new Producto();
                           
                                
                                ClaveProd=panelDatos.getClave();
                                NodoBuscar=ListaProd.Buscar(ClaveProd);
                                
                                if(NodoBuscar!=null)
                                {
                                    ClaveProd=NodoBuscar.getInfoProducto().getClaveProd();
                                panelDatos.setClave(ClaveProd);
                                NombreProd=NodoBuscar.getInfoProducto().getNombreProd();
                                panelDatos.setNombre(NombreProd);
                                PrecioProd=NodoBuscar.getInfoProducto().getPrecioProd();
                                panelDatos.setPrecio(String.valueOf(PrecioProd));
                                }
                                else
                                {
                                         panelDatos.setClave("No existe");
                                         panelDatos.setNombre("No existe");
                                         panelDatos.setPrecio(String.valueOf("No existe"));
                                }
                      
			}
		}
	}

}
