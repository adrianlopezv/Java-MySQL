
package Modelo;
//Practica 1, parte 2-> Adrian Lopez Vudoyra
public class Persona
{
    protected int edad;
    protected Nombre nombre=new Nombre();
    
    public Persona()
    {
    this.edad=0;
    }
    
    public Persona(String Nombre,String ApellidoP,String ApellidoM)
    {
   Nombre nombre = new Nombre(Nombre,ApellidoP,ApellidoM);
   this.nombre=nombre;
    }
    
    public Nombre getNombre()
    {
    return nombre;
    }
    
    public void setNombre(String Nombre,String ApellidoP,String ApellidoM)
    {
    nombre.setNombre(Nombre);
    nombre.setApellidoP(ApellidoP);
    nombre.setApellidoM(ApellidoM);
    }
    
    public int getedad()
    {
    return edad;
    }
    
    public void setedad(int edad)
    {
    this.edad=edad;
    }
    
      public String getNombreCompleto()
    {
    String nombreCompleto;
    nombreCompleto=nombre.getNombre()+""+nombre.getApellidoP()+""+nombre.getApellidoM();
    return nombreCompleto;
    
    }
}

