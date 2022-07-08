//Primer proyecto-> Aguirre Daran Marco y Lopez Vudoyra Adrian
package proyectoprimerparcial;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class RandomFile 
{
    public void GrabarArchivo(RandomAccessFile archivo,byte[] Nombre,byte[] ApellidoP,
            byte[] ApellidoM,byte[] edad,byte[] nombreImagen)
    {
        String linea,elim="Eliminado",salto="\r\n";
        String sNombre,sApellidoP,sApellidoM,Nombres,ApellidoPs,ApellidoMs;
        long p=0,paux=1;
        int band=0,bandera=0;
        try {
            while(archivo.getFilePointer()<archivo.length())
            {
                 p=archivo.getFilePointer();
                linea=archivo.readLine();
               linea=linea.substring(0,9);
               if(linea.equals(elim))
                {
                   paux=p;
                    band=1;                    
                }  
            }
            archivo.seek(0);
            while(archivo.getFilePointer()<archivo.length()&&bandera==0)
            {
                p=archivo.getFilePointer();
                linea=archivo.readLine();
                sNombre=linea.substring(0,30);
                Nombres=new String(Nombre,"UTF-8");
                sApellidoP=linea.substring(30,60);
                ApellidoPs=new String(ApellidoP,"UTF-8");
                sApellidoM=linea.substring(60,90);
                ApellidoMs=new String(ApellidoM,"UTF-8");
               
               if(sNombre.equals(Nombres))
                {
                     if(sApellidoP.equals(ApellidoPs))
                     {
                        if(sApellidoM.equals(ApellidoMs))
                        {   
                            bandera=1;
                        }
                        
                      }
                }  
            }
            if(bandera==1)
            {
           System.out.println("Ese usuario ya existe");
            }
            else
            {
            if(band==1)
            {
            archivo.seek(paux);
            archivo.write(Nombre);
            archivo.write(ApellidoP);
            archivo.write(ApellidoM);
            archivo.write(edad);
            archivo.write(nombreImagen);
            archivo.write(salto.getBytes());
            }
            else
            {
            archivo.seek(archivo.length());
            archivo.write(Nombre);
            archivo.write(ApellidoP);
            archivo.write(ApellidoM);
            archivo.write(edad);
            archivo.write(nombreImagen);
            archivo.write(salto.getBytes());
            }
            }
            
        } catch (IOException ex) {
          System.err.println(ex+"Error");
        }
    }
    
    public boolean Cambio(RandomAccessFile archivo,byte[] Nombre,byte[] ApellidoP,byte[] ApellidoM,int op)
    {
        String sNombre,sApellidoP,sApellidoM,linea,Nombres,ApellidoPs,ApellidoMs;
    boolean existe=false;
    int b=0,band=0;
    long p=0;
        try {
            archivo.seek(0);
           
            while(archivo.getFilePointer()<archivo.length()&&band==0)
            {
                p=archivo.getFilePointer();
                linea=archivo.readLine();
                sNombre=linea.substring(0,30);
                Nombres=new String(Nombre,"UTF-8");
                sApellidoP=linea.substring(30,60);
                ApellidoPs=new String(ApellidoP,"UTF-8");
                sApellidoM=linea.substring(60,90);
                ApellidoMs=new String(ApellidoM,"UTF-8");
               
               if(sNombre.equals(Nombres))
                {
                     if(sApellidoP.equals(ApellidoPs))
                     {
                        if(sApellidoM.equals(ApellidoMs))
                        {   
                            if(op==3)
                            {
                            MenuCambio(p,archivo);
                            return true;
                            }
                            if(op==2)
                            {
                                MenuEliminacion(p,archivo);
                            return true;
                            }
                            
                        }
                        
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
    String Nombre,ApellidoP,ApellidoM,edad,Linea,nombreImagen;
        try {
            Scanner entrada=new Scanner(System.in);
            Scanner entradastr=new Scanner(System.in);
            int opcion=-1;
            archivo.seek(inicio);
            Linea=archivo.readLine();
          Nombre=Linea.substring(0,30);
               ApellidoP=Linea.substring(30,60);
                ApellidoM=Linea.substring(60,90);
                edad=Linea.substring(90,100);
                            
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
                        Nombre=entradastr.next();
                        for(int i=Nombre.length();i<30;i++)
                 {
                    Nombre+=" ";
                  }
                        archivo.writeBytes(Nombre);
            
                        break;
                        
                    case 2:
                          archivo.seek(inicio+30);
                        System.out.println("Ingrese el Apellido Paterno nuevo: ");
                       ApellidoP=entradastr.next();
                       for(int i=ApellidoP.length();i<30;i++)
                 {
                    ApellidoP+=" ";
                  }
            archivo.write(ApellidoP.getBytes());
                        break;
                        
                    case 3:
                          archivo.seek(inicio+60);
                        System.out.println("Ingrese el Apellido Materno nuevo: ");
                        ApellidoM=entradastr.next();
                        for(int i=ApellidoM.length();i<30;i++)
                 {
                    ApellidoM+=" ";
                  }
            archivo.write(ApellidoM.getBytes());
                        break;
                        
                    case 4:
                          archivo.seek(inicio+90);
                        System.out.println("Ingrese la edad nueva: ");
                         edad=entradastr.next();
                         for(int i=edad.length();i<10;i++)
                 {
                    edad+=" ";
                  }
            archivo.write(edad.getBytes());
                        break;
                        
                    case 5:
                        archivo.seek(inicio+100);
                        nombreImagen="Im"+Nombre.substring(0, 3)+edad.substring(0,1)+".jpg";
                        archivo.writeBytes(nombreImagen);
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
    
    public void MenuEliminacion(Long inicio,RandomAccessFile archivo)
    {
    String borrado="Eliminado";
    String salto="\r\n";
    for(int i=borrado.length();i<110;i++)
    {
    borrado+=" ";
    }
        try {
           archivo.seek(inicio);
           archivo.writeBytes(borrado);
            archivo.write(salto.getBytes());                
        }
        catch(IOException ex)
        {
           
        }
    }
}
