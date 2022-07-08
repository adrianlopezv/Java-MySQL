package Utilerias;
import Modelo.Producto;
import java.util.Scanner;
//Practica 1, -> Isabel Gomez Vargas y Adrian Lopez Vudoyra
public class ListaSimple
{
    private Nodo nodoRaiz;

public void insertarFinal(Nodo nodo)
{
Nodo nodoAux;
int b=0;
if(this.nodoRaiz==null)
{
this.nodoRaiz=nodo;
}
else
{
nodoAux=nodoRaiz;
    while(nodoAux.getNodoSig()!=null&&b!=1)
    {
        if(nodoAux.getInfoProducto().getClaveProd().equals(nodo.getInfoProducto().getClaveProd()))
        {
        System.out.println("\nEse producto ya existe!\n");
        b=1;
        }
        else
        {
        nodoAux=nodoAux.getNodoSig();
        }
    }
    if(b==0)
    {
    nodoAux.setNodoSig(nodo);
    }
}
    
}

public void Modificar(Nodo referencia)
{
    boolean b=true;
   
Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
System.out.println(referencia.getInfoProducto().getInfoProdTot());
if(nodoAux.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
{
   
    MenuCambio(nodoAux);
}
else
{
while(!nodoAux2.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd())
        &&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
        {
        b=false;
        }
if(b==false)
{
MenuCambio(nodoAux2);
}
else
{
System.out.println("Ese elemento no existe");
}
}

}

public void borrarDespuesde(Nodo referencia)
{
    boolean b=true;
Nodo nodoAux,nodoAux2;
nodoAux=nodoRaiz;
nodoAux2=nodoAux.getNodoSig();
if(nodoAux.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
{
    nodoRaiz=nodoAux2;
nodoAux=null;
}
else
{
while(!nodoAux2.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd())
        &&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfoProducto().getClaveProd().equals(referencia.getInfoProducto().getClaveProd()))
        {
        b=false;
        }
if(b==false)
{
nodoAux.setNodoSig(nodoAux2.getNodoSig());
nodoAux2.setNodoSig(null);
}
else
{
System.out.println("Ese elemento no existe");
}
}

}

public String toString()
{
    String listaString="";
    if(this.nodoRaiz==null)
    {
    listaString="lista Vacia";
    }
    else
    {
    Nodo nodoAux;
    nodoAux=nodoRaiz;
    while(nodoAux!=null)
    {
        Producto producto=new Producto();
        producto=nodoAux.getInfoProducto();
    listaString+=producto.getClaveProd()+" "+producto.getNombreProd()+" "+"$"+producto.getPrecioProd()+"\n";
    nodoAux=nodoAux.getNodoSig();
    }
    }
return listaString;
}

public Nodo getNodoRaiz()
{
return nodoRaiz;
}

public void MenuCambio(Nodo nodoAux)
{
     Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=-1;
    do
    {
    System.out.println("¿Que deseas cambiar?\n1.-Clave del producto: "+nodoAux.getInfoProducto().getClaveProd()
            +"\n2.-Nombre del producto: "+nodoAux.getInfoProducto().getNombreProd()
            +"\n3.-Precio: "+nodoAux.getInfoProducto().getPrecioProd()
            +"\n4.-Regresar a menu anterior");
    opcion=entrada.nextInt();
    switch(opcion)
            {
        case 1: 
            System.out.println("Ingrese la nueva clave: ");
            nodoAux.getInfoProducto().setClaveProd(entradastr.nextLine());
            break;
            
        case 2:
             System.out.println("Ingrese el nombre nuevo: ");
            nodoAux.getInfoProducto().setNombreProducto(entradastr.nextLine());
            break;
            
        case 3:
             System.out.println("Ingrese el precio: ");
            nodoAux.getInfoProducto().setPrecioProd(entradastr.nextInt());
            break;
            
        case 4:
            break;
            
        default:
            System.out.println("Esa opcion no existe, favor de escoger una valida");
            break;
            
            }
    }while(opcion!=4);

}

}