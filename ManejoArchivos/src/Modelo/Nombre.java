
package Modelo;
//Practica 1-> Marco Aguirre Daran y Adrian Lopez Vudoyra
public class Nombre
{
  public String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    
    public Nombre()
    {
    this.Nombre=null;
    this.ApellidoP=null;
    this.ApellidoM=null;
    }
    
    public Nombre(String Nombre,String ApellidoP,String ApellidoM)
    {
     this.Nombre=Nombre;
    this.ApellidoP=ApellidoP;
    this.ApellidoM=ApellidoM;
    }
    
    public String getNombre()
    {
    return Nombre;
    }
    
    public void setNombre(String nombre)
    {
    this.Nombre=nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }  
    
  
    
}
