
package Utileria;
import Modelo.Usuario;
//Practica 1-> Marco Aguirre Daran y Adrian Lopez Vudoyra
public class Nodo 
{
    protected Usuario info;
    private Nodo nodoSig;

    public Nodo()
    {
    info=null;
    nodoSig=null;
    }
    
    public Nodo(Usuario info)
    {
    this.info=info;
    }

    public Usuario getInfoUsuario() 
    {
        return info;
    }

    public void setInfoUsuario(Usuario info) 
    {
        this.info = info;
    }

    public Nodo getNodoSig() 
    {
        return nodoSig;
    }

    public void setNodoSig(Nodo nodoSig) 
    {
        this.nodoSig = nodoSig;
    }

}
