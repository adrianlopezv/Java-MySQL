
package primerparcial;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class RandomFile 
{
      public void GrabarArchivo(RandomAccessFile archivo,String Nombre,String ApellidoP,String ApellidoM,String edad,String nombreImagen)
    {
        try {
            archivo.seek(archivo.length());
            archivo.writeUTF(Nombre);
            archivo.writeUTF(ApellidoP);
            archivo.writeUTF(ApellidoM);
            archivo.writeUTF(edad);
            archivo.writeUTF(nombreImagen);
        } catch (IOException ex) {
          System.err.println(ex+"Error");
        }
    }
    
    public boolean Cambio(RandomAccessFile archivo,String Nombre,String ApellidoP,String ApellidoM)
    {
    boolean existe=false;
    int b=0,band=0;
    long p=0;
        try {
            archivo.seek(0);
            while(archivo.getFilePointer()<archivo.length()&&band==0)
            {
               p=archivo.getFilePointer();
            if(archivo.readUTF().equals(Nombre))
                {
                    b=1;
                     if(archivo.readUTF().equals(ApellidoP))
                     {
                         b=2;
                        if(archivo.readUTF().equals(ApellidoM))
                        {
                            MenuCambio(p,archivo);
                            band=1;
                            return true;
                        }
                        
                      }
                }
            else 
            {
                if(b==0)
                {
                    archivo.readUTF();
                    archivo.readUTF();
                    archivo.readUTF();
                    archivo.readUTF();
                    archivo.readUTF();
                }
                if(b==1)
                {
                    archivo.readUTF();
                    archivo.readUTF();
                    archivo.readUTF();
                     archivo.readUTF();
                }
                if(b==2)
                {
                    archivo.readUTF();
                    archivo.readUTF();
                     archivo.readUTF();
                }
            }
                
            }
        } catch (IOException ex) {
            System.err.println(ex+" Error");
            return false;
        }
    return existe;
    }
    
    public void MenuCambio(Long inicio,RandomAccessFile archivo)
{
    String Nombre,ApellidoP,ApellidoM,edad;
        try {
            Scanner entrada=new Scanner(System.in);
            Scanner entradastr=new Scanner(System.in);
            int opcion=-1;
            archivo.seek(inicio);
            Nombre=archivo.readUTF();
            ApellidoP=archivo.readUTF();
                    ApellidoM=archivo.readUTF();
                    edad=archivo.readUTF();
                            
            do
            {
                archivo.seek(inicio);
                System.out.println("¿Que deseas cambiar?\n1.-Nombre: "+Nombre
                        +"\n2.-Apellido Paterno: "+ApellidoP
                        +"\n3.-Apellido Materno: "+ApellidoM
                        +"\n4.-Edad: "+edad
                        +"\n5.-Regresar a menu anterior");
                opcion=entrada.nextInt();
                switch(opcion)
                {
                    case 1:
                        System.out.println("Ingrese el nombre nuevo: ");
                        Nombre=entradastr.nextLine();
                        archivo.writeUTF(Nombre);
            archivo.writeUTF(ApellidoP);
            archivo.writeUTF(ApellidoM);
            archivo.writeUTF(edad);
            
                        break;
                        
                    case 2:
                          archivo.seek(inicio);
                        System.out.println("Ingrese el Apellido Paterno nuevo: ");
                       ApellidoP=entradastr.nextLine();
                       archivo.writeUTF(Nombre);
            archivo.writeUTF(ApellidoP);
            archivo.writeUTF(ApellidoM);
            archivo.writeUTF(edad);
                        break;
                        
                    case 3:
                          archivo.seek(inicio);
                        System.out.println("Ingrese el Apellido Materno nuevo: ");
                        ApellidoM=entradastr.nextLine();
                       archivo.writeUTF(Nombre);
            archivo.writeUTF(ApellidoP);
            archivo.writeUTF(ApellidoM);
            archivo.writeUTF(edad);
                        break;
                        
                    case 4:
                          archivo.seek(inicio);
                        System.out.println("Ingrese la edad nueva: ");
                         edad=entrada.nextLine();
                       archivo.writeUTF(Nombre);
            archivo.writeUTF(ApellidoP);
            archivo.writeUTF(ApellidoM);
            archivo.writeUTF(edad);
                        break;
                        
                    case 5:
                        break;
                        
                    default:
                        System.out.println("Esa opcion no existe, favor de escoger una valida");
                        break;
                        
                }
            }while(opcion!=5);
        } catch (IOException ex) {
            System.out.println("Error: "+ex);
        }

}
}
