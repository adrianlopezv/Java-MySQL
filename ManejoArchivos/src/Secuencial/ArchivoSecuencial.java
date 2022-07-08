
package Secuencial;
import Utileria.*;
import Modelo.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//Practica 1, parte 2-> Adrian Lopez Vudoyra

public class ArchivoSecuencial
{  
    private Formatter archivo;
    
   public ArchivoSecuencial()
   {
   
   }
    
   public ListaSimple leerArchivo(String nombrearchivo) 
   {
       ListaSimple listaArchivo=new ListaSimple();
        try {
            Scanner input=new Scanner(new File(nombrearchivo));

while(input.hasNext())
{
    Usuario usuario=new Usuario();
    usuario.setNombre(input.next(),input.next(),input.next());
    usuario.setedad(input.nextInt());
    usuario.setImagenAlias(input.next());
     listaArchivo.insertarFinal(new Nodo(usuario));
             
}
        } catch (IOException ex) {
           System.err.println("No habia archivo existente\n");
           System.out.println("Se creara el archivo al finalizar la aplicacion. :)\n");
        }
       return listaArchivo;
   }
   
   public void grabarArchivo(String nombrearchivo,ListaSimple lista)
   {
       try {
            archivo= new Formatter(nombrearchivo);
            Nodo nodoAux;
    nodoAux=lista.getNodoRaiz();
     while(nodoAux!=null)
    {
        Usuario usuario=new Usuario();
        usuario=nodoAux.getInfoUsuario();
    archivo.format("%s %s %s %d %s\n%n",usuario.getNombre().getNombre(),usuario.getNombre().getApellidoP(),
            usuario.getNombre().getApellidoM(),usuario.getedad(),usuario.getImagenAlias());
    nodoAux=nodoAux.getNodoSig();
    }
     archivo.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
          
    
   }
}

