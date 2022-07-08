package Utilerias;
import Modelo.Producto;
//Practica 1-> Isabel Gomez Vargas y Adrian Lopez Vudoyra
public class Nodo 
{
    protected Producto info;
    private Nodo nodoSig;

    public Nodo()
    {
    info=null;
    nodoSig=null;
    }
    
    public Nodo(Producto info)
    {
    this.info=info;
    }

    public Producto getInfoProducto() 
    {
        return info;
    }

    public void setInfoProducto(Producto info) 
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