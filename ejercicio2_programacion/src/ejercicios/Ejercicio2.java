package ejercicios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ejercicio2 {


	public static void escribirFichero(String nomFich, String texto) {
		try (FileWriter fich = new FileWriter(nomFich);) {
 
			// Escribimos el texto en el fichero
			fich.write(texto);
 
		} catch (IOException e) {
//			System.out.println("Error al escribir en el fichero " + e);
			JOptionPane.showMessageDialog(null, "Error al escribir en el fichero" + e);
		}
	}
 
	public static void mostrarFichero(String nomFich) {
 
		System.out.println("El contenido de: " + nomFich + " es: ");
		// Leemos texto del fichero
		try (FileReader fr = new FileReader(nomFich)) {
 
			int caracter = fr.read();
 
			while (caracter != -1) {
 
				System.out.print((char) caracter);
				caracter = fr.read();
			}
 
		} catch (IOException e) {
			System.out.println("Problema con la lectura/excritura en el fichero " + e);
		}
 
	}
	
	
	public static void main(String[] args) {
		/*
		 * Realiza un programa en Java donde introduzcas la ruta de un fichero por
		 * teclado y un texto que queramos a escribir en el fichero con
		 * JOptionPane.showInputDialog. Posteriormente, muestra el contenido del fichero.
		 */
		
		String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero");
		String texto = JOptionPane.showInputDialog("Introduce el texto que quieres escribir en el fichero");
		escribirFichero(ruta, texto);
 
		mostrarFichero(ruta);
 
	}
	
 
}