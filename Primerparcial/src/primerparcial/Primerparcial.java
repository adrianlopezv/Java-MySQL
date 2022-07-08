
package primerparcial;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Primerparcial {

    public static void main(String[] args)
    {
            int opcion;
        String Nombre,ApellidoP,ApellidoM,nombreImagen,edad;
        boolean existe;
        String[] datos;
        Scanner entrada=new Scanner(System.in);
        Scanner entrada1=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
        try {
            RandomAccessFile archivo=new RandomAccessFile("PrimerParcial.txt","rw");
            RandomFile archivor=new RandomFile();
            do
    {
       
    System.out.println("Seleccione la opcion deseada:\n1.-Insertar Usuario\n2.-Borrado especifico"
            + "\n3.-Realizar modificacion\n4.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:    
            System.out.println("Ingrese nombre");
            Nombre=entradastr.nextLine(); 
             System.out.println("Ingrese apellido paterno");
            ApellidoP=entradastr.nextLine();
             System.out.println("Ingrese apellido materno");
            ApellidoM=entradastr.nextLine();
            System.out.println("Ingrese edad");
            edad=entrada1.nextLine();
            nombreImagen="Imagen"+Nombre+edad+".jpg";
            archivor.GrabarArchivo(archivo, Nombre, ApellidoP, ApellidoM, edad, nombreImagen);
            
            break;
            
            
        case 2:
            if(archivo.length()==0)
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
            existe=archivor.Cambio(archivo, Nombre, ApellidoP, ApellidoM);
            if (existe==true)
                {
                    System.out.println("Cambio hecho");
                }
            else
                {
                    System.out.println("No existe ese nombre");
                 }
            }
            break;
            
        case 3:
            System.out.println("Ingrese el nombre de la persona a hacer cambios");
            Nombre=entradastr.nextLine();
             System.out.println("Ingrese apellido paterno de la persona a hacer cambios ");
            ApellidoP=entradastr.nextLine();
             System.out.println("Ingrese apellido materno de la persona a hacer cambios");
            ApellidoM=entradastr.nextLine();
            existe=archivor.Cambio(archivo, Nombre, ApellidoP, ApellidoM);
            if (existe==true)
                {
                    System.out.println("Cambio hecho");
                }
            else
                {
                    System.out.println("No existe ese nombre");
                 }
            break;
            
        case 4:
            System.out.println("Archivo creado\nGracias,hasta luego!");
       break;
             default:
            System.out.println("Esa opcion no existe, favor de seleccionar otra");
            break;
            
    }
    }while(opcion!=4);
        } catch (IOException ex) {
         System.err.println(ex);
        }
        
    }
    
    
    
}
