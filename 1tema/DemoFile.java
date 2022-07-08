import java.io.File;
import java.util.Scanner;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		File actual = new File(".");
		try{
			System.out.println("Directorio Actual: " + actual.getCanonicalPath());
		}catch(Exception e){
			System.out.println("Error al leer la ruta....");
		}
		
		System.out.println("Nombre de archivo o directorio");
		analizarPath(entrada.nextLine());
		entrada.close();
	}
	
	public static void analizarPath(String path) {
		File descriptor = new File(path);
		if(descriptor.exists()) {
			if(descriptor.isFile()) {
				System.out.println("Nombre del archivo: " + descriptor.getName());
				if(descriptor.isAbsolute()) {
					System.out.println("El path es un path absoluto");
				}else {
					System.out.println("El path es un path relativo");
				}
				System.out.println("Ultima Modificación: " + descriptor.lastModified());
				System.out.println("Longitud: " + descriptor.length());
				System.out.println("Path: " + descriptor.getPath());
				System.out.println("Path absoluto: " + descriptor.getAbsolutePath());
				System.out.println("Directorio padre: " + descriptor.getParent());
			}
			if(descriptor.isDirectory()) {
				String lista[]= descriptor.list();
				System.out.println("Contenido del directorio: ");
				for(String nombre : lista) {
					System.out.println(nombre);
				}
			}
		}else {
			System.out.println("El path no existe....");
		}
	}

}
