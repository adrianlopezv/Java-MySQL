
package Modelo;
import Utileria.*;
//Practica 1, parte 2-> Adrian Lopez Vudoyra
public class Usuario extends Persona
{
    protected Imagen imagen=new Imagen();
    public Usuario()
    {
    
    }
    public Usuario(String nombre, String ApellidoP, String ApellidoM)
    {
    super(nombre,ApellidoP,ApellidoM);
    }
    
   public String getImagenAlias() 
   {
   return imagen.getNombreImagen();
   }
   
    public void setImagenAlias(String nombreimagen)
    {
    imagen.setNombreImagen(nombreimagen);
    }
}
