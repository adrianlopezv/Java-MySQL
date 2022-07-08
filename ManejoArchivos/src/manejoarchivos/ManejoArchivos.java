
package manejoarchivos;
import Utileria.*;
import Modelo.*;
import Secuencial.ArchivoSecuencial;
import java.util.Scanner;
//Practica 1, parte 2-> Adrian Lopez Vudoyra
public class ManejoArchivos {

    public static void main(String[] args) 
    {
        String dato,dato1;
    Scanner entrada=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
    int opcion=0;
    ListaSimple listasimple=new ListaSimple();
    String Nombre,ApellidoP,ApellidoM;
    ArchivoSecuencial archivosecuencial=new ArchivoSecuencial();
    listasimple=archivosecuencial.leerArchivo("lista.txt");
  
    do
    {
        System.out.println(listasimple);
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Usuario\n2.-Borrado especifico"
            + "\n3.-Realizar modificacion\n4.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:
            Nombre nombre=new Nombre();
            Persona persona=new Persona();
            Usuario usuario=new Usuario();
            
            System.out.println("Ingrese nombre");
            Nombre=entradastr.nextLine(); 
             System.out.println("Ingrese apellido paterno");
            ApellidoP=entradastr.nextLine();
             System.out.println("Ingrese apellido materno");
            ApellidoM=entradastr.nextLine();
            usuario.setNombre(Nombre, ApellidoP, ApellidoM);
            System.out.println("Ingrese edad");
            usuario.setedad(entrada.nextInt());
            persona.setNombre(nombre.getNombre(),nombre.getApellidoP(),nombre.getApellidoM());
            usuario.setImagenAlias("Imagen"+Nombre+usuario.getedad()+".jpg");
            listasimple.insertarFinal(new Nodo(usuario));
            break;
            
            
        case 2:
            if(listasimple.getNodoRaiz()==null)
         {
            System.out.println("No hay nada que borrar");
         }
        else
            {
           System.out.println("Ingrese nombre de la persona a borrar");
            Nombre=entradastr.nextLine();
             System.out.println("Ingrese apellido paterno de la persona a borrar ");
            ApellidoP=entradastr.nextLine();
             System.out.println("Ingrese apellido materno de la persona a borrar");
            ApellidoM=entradastr.nextLine();
            Usuario usuario1=new Usuario(Nombre,ApellidoP,ApellidoM);
           listasimple.borrarDespuesde(new Nodo(usuario1));
            }
            break;
            
        case 3:
            System.out.println("Ingrese el nombre de la persona a hacer cambios");
            Nombre=entradastr.nextLine();
             System.out.println("Ingrese apellido paterno de la persona a hacer cambios ");
            ApellidoP=entradastr.nextLine();
             System.out.println("Ingrese apellido materno de la persona a hacer cambios");
            ApellidoM=entradastr.nextLine();
            Usuario usuario1=new Usuario(Nombre,ApellidoP,ApellidoM);
            
           listasimple.Modificar(new Nodo(usuario1));
            
            break;
            
        case 4:
            archivosecuencial.grabarArchivo("lista.txt", listasimple);
            System.out.println("Archivo creado\nGracias,hasta luego!");
       break;
             default:
            System.out.println("Esa opcion no existe, favor de seleccionar otra");
            break;
            
    }
    }while(opcion!=4);
    }
    }
   
