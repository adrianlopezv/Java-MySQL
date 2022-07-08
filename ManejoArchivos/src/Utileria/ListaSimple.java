package Utileria;
import Modelo.Usuario;
import java.util.Scanner;
//Practica 1, parte 2-> Adrian Lopez Vudoyra
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
        if(nodoAux.getInfoUsuario().getNombreCompleto().equals(nodo.getInfoUsuario().getNombreCompleto()))
        {
        System.out.println("\nEse usuario ya existe!\n");
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
System.out.println(referencia.getInfoUsuario().getNombreCompleto());
 System.out.println(nodoAux.getInfoUsuario().getNombreCompleto());
if(nodoAux.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
{
   
    MenuCambio(nodoAux);
}
else
{
while(!nodoAux2.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto())
        &&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
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
if(nodoAux.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
{
    nodoRaiz=nodoAux2;
nodoAux=null;
}
else
{
while(!nodoAux2.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto())
        &&nodoAux2.getNodoSig()!=null)
        {
        nodoAux=nodoAux2;
        nodoAux2=nodoAux.getNodoSig();
        if(nodoAux.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
        {
        b=false;
        }
        }
if(nodoAux2.getInfoUsuario().getNombreCompleto().equals(referencia.getInfoUsuario().getNombreCompleto()))
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
        Usuario usuario=new Usuario();
        usuario=nodoAux.getInfoUsuario();
    listaString+=usuario.getNombre().getNombre()+" "+usuario.getNombre().getApellidoP()+" "
            +usuario.getNombre().getApellidoM()+" edad="+usuario.getedad()+" años "+usuario.getImagenAlias()+"\n";
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
    System.out.println("¿Que deseas cambiar?\n1.-Nombre: "+nodoAux.getInfoUsuario().getNombre().getNombre()
            +"\n2.-Apellido Paterno: "+nodoAux.getInfoUsuario().getNombre().getApellidoP()
            +"\n3.-Apellido Materno: "+nodoAux.getInfoUsuario().getNombre().getApellidoM()
            +"\n4.-Edad: "+nodoAux.getInfoUsuario().getedad()
            +"\n5.-Regresar a menu anterior");
    opcion=entrada.nextInt();
    switch(opcion)
            {
        case 1: 
            System.out.println("Ingrese el nombre nuevo: ");
            nodoAux.getInfoUsuario().getNombre().setNombre(entradastr.nextLine());
            break;
            
        case 2:
             System.out.println("Ingrese el Apellido Paterno nuevo: ");
            nodoAux.getInfoUsuario().getNombre().setApellidoP(entradastr.nextLine());
            break;
            
        case 3:
             System.out.println("Ingrese el Apellido Materno nuevo: ");
            nodoAux.getInfoUsuario().getNombre().setApellidoM(entradastr.nextLine());
            break;
            
        case 4:
             System.out.println("Ingrese la edad nueva: ");
            nodoAux.getInfoUsuario().setedad(entrada.nextInt());
            break;
        
        case 5:
            break;
            
        default:
            System.out.println("Esa opcion no existe, favor de escoger una valida");
            break;
            
            }
    }while(opcion!=5);

}

}
