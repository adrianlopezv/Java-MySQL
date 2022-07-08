package modelo;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.Scanner;


public class Imagen {
	private String nombreArchivo;
	private BufferedImage img;
	
	public Imagen (String nombreArchivo){
		this.nombreArchivo = nombreArchivo;
		try{
			leerImagen(nombreArchivo);
		}catch(Exception e){
			System.out.println("No se pudo inicializar imagen");
		}
	}
	
	public BufferedImage getImagen(){
		return this.img;
	}
	
	public void setImagen(BufferedImage imagen){
		this.img = imagen;
	}
			
	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public BufferedImage leerImagen(String nombreArchivo){
		System.out.println(nombreArchivo);
		try {
			img = ImageIO.read(new File(nombreArchivo));
		}catch(IOException ex){
			System.out.println("No se pudo leer la imagen");
		} 
		return img;
	}	
}





