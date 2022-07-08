
package proyectoprimerparcial;
import java.io.*;
import java.util.*;
public class Proyectoprimerparcial {
//Primer proyecto-> Aguirre Daran Marco y Lopez Vudoyra Adrian
    public static void main(String[] args)
    {
        int opcion;
        byte[] Nombreb = new byte[30];
        
             byte[]   ApellidoPb= new byte[30];
              for(int i=0;i<30;i++)
        {
        ApellidoPb[i]=' ';
        }
              byte[]  ApellidoMb= new byte[30];
              for(int i=0;i<30;i++)
        {
        ApellidoMb[i]=' ';
        }
                    byte[]    nombreImagenb= new byte[30];
                    for(int i=0;i<30;i++)
        {
        nombreImagenb[i]=' ';
        }
                     byte[]   edadb = new byte[10];
                     for(int i=0;i<9;i++)
        {
        edadb[i]=' ';
        }
        String Nombre,ApellidoP,ApellidoM,nombreImagen,edad;
        boolean existe;
        Scanner entrada=new Scanner(System.in);
        Scanner entrada1=new Scanner(System.in);
    Scanner entradastr=new Scanner(System.in);
        try {
            RandomAccessFile archivo=new RandomAccessFile("PrimerParcial.txt","rw");
            RandomFile archivor=new RandomFile();
            do
    {
       
    System.out.println("Esta aplicacion crea un archivo txt con la informacion de los usuarios\n"
            + "Seleccione la opcion deseada:\n1.-Insertar Usuario\n2.-Borrado especifico"
            + "\n3.-Realizar modificacion\n4.-Fin");
    opcion=entrada.nextInt();
    
    switch(opcion)
    {
        case 1:    
            System.out.println("Ingrese nombre");
            Nombre=entradastr.next(); 
            for(int i=Nombre.length();i<30;i++)
                 {
                    Nombre+=" ";
                  }
            Nombreb=Nombre.getBytes();
            
             System.out.println("Ingrese apellido paterno");
            ApellidoP=entradastr.next();
            for(int i=ApellidoP.length();i<30;i++)
                 {
                    ApellidoP+=" ";
                  }
            ApellidoPb=ApellidoP.getBytes();
             System.out.println("Ingrese apellido materno");
            ApellidoM=entradastr.next();
            for(int i=ApellidoM.length();i<30;i++)
                 {
                    ApellidoM+=" ";
                  }
            ApellidoMb=ApellidoM.getBytes();
            System.out.println("Ingrese edad");
            edad=entrada1.next();
            for(int i=edad.length();i<10;i++)
                 {
                   edad+=" ";
                  }
            edadb=edad.getBytes();
            nombreImagen="Im"+Nombre.substring(0, 3)+edad.substring(0,1)+".jpg";
           
            nombreImagenb=nombreImagen.getBytes();
            archivor.GrabarArchivo(archivo, Nombreb, ApellidoPb, ApellidoMb, edadb, nombreImagenb);
            
            break;
            
            
        case 2:
            if(archivo.length()==0)
         {
            System.out.println("No hay nada que borrar");
         }
        else
            {
           System.out.println("Ingrese nombre de la persona a borrar");
            Nombre=entradastr.next();
            for(int i=Nombre.length();i<30;i++)
                 {
                    Nombre+=" ";
                  }
            Nombreb=Nombre.getBytes();
             System.out.println("Ingrese apellido paterno de la persona a borrar ");
            ApellidoP=entradastr.next(); 
            for(int i=ApellidoP.length();i<30;i++)
                 {
                    ApellidoP+=" ";
                  }
            ApellidoPb=ApellidoP.getBytes();
             System.out.println("Ingrese apellido materno de la persona a borrar");
            ApellidoM=entradastr.next();
            for(int i=ApellidoM.length();i<30;i++)
                 {
                    ApellidoM+=" ";
                  }
            ApellidoMb=ApellidoM.getBytes();
            
            existe=archivor.Cambio(archivo, Nombreb, ApellidoPb, ApellidoMb,2);
            if (existe==true)
                {
                    System.out.println("Eliminado");
                }
            else
                {
                    System.out.println("No existe ese nombre");
                 }
            }
            break;
            
        case 3:
            System.out.println("Ingrese el nombre de la persona a hacer cambios");
            Nombre=entradastr.next();
            for(int i=Nombre.length();i<30;i++)
                 {
                    Nombre+=" ";
                  }
            Nombreb=Nombre.getBytes();
            
             System.out.println("Ingrese apellido paterno de la persona a hacer cambios ");
            ApellidoP=entradastr.next(); 
            for(int i=ApellidoP.length();i<30;i++)
                 {
                    ApellidoP+=" ";
                  }
            ApellidoPb=ApellidoP.getBytes();
           
             System.out.println("Ingrese apellido materno de la persona a hacer cambios");
            ApellidoM=entradastr.next();
            for(int i=ApellidoM.length();i<30;i++)
                 {
                    ApellidoM+=" ";
                  }
            ApellidoMb=ApellidoM.getBytes();
            existe=archivor.Cambio(archivo, Nombreb, ApellidoPb, ApellidoMb,3);
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
