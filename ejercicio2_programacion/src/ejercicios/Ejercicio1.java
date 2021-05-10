package ejercicios;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
 
	public static void main(String[] args) {
 
		final String nomFichero = "D:\\Ejercicio1.txt"; //importante doble barra para que lo entienda como caracter
		try (FileReader fich = new FileReader(nomFichero)) {
 
			int valor = fich.read();
			while (valor != -1) {
				// El carácter ASCII 32 es el espacio. Si el carácter es un espacio no lo escribe.
				if (valor != 32) {
					System.out.print((char) valor);
				}else{
					System.out.print((char)95);//PINTA '_' EN LOS ESPACIOS '_'=95 EN ASCII
				}
				valor = fich.read();
			}
		} catch (IOException e) {
			System.out.println("Fichero no existe o ruta fichero incorrecta " + e);
		}
		
		
	//----------
		
//		final String nomFichero1 = "D:\\Ejercicio2.txt"; //importante doble barra para que lo entienda como caracter
//		try (FileReader fich1 = new FileReader(nomFichero1)) {
// 
//			int valor1 = fich1.read();
//			System.out.println("VALOR 2: " + String.valueOf(valor1));
//			while (valor1 != -1) {
//				// El carácter ASCII 32 es el espacio. Si el carácter es un espacio no lo escribe.
//				if (valor1 != 32) {
//					System.out.print((char) valor1);
//				}
//				valor1 = fich1.read();
//			}
//		} catch (IOException e) {
//			System.out.println("Fichero no existe o ruta fichero incorrecta " + e);
//		}
		
		
	}
}